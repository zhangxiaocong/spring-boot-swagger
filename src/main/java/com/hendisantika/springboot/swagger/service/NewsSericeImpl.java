package com.hendisantika.springboot.swagger.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsSericeImpl implements NewsService {

    @Override
    public Boolean delNews(Integer id) {
        int i =1;
        return i == 1 ? true : false;
    }

    @Override
    public Integer getNewsCount() {
        return 1;
    }


}