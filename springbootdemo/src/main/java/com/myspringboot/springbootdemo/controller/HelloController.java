package com.myspringboot.springbootdemo.controller;

import com.myspringboot.springbootdemo.configurations.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Person person;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/getperson")
    public String getPerson() {
        return person.getLists().toString();
    }
}
