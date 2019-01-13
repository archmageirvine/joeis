#include <gmp.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#ifndef boolean
#define boolean int
#define false 0
#define true 1
#endif

const char *TARGET[] = {
  "44934932784038660743085694310776796224", // A080808
  "82626753081964483505319130781618465733184", // SAI 2009-09-01 // A080809 == A080514
  "44934932784038660743085694310776796224", // SAI 2009-09-01 // A080812
  "15177620126188504995068476821390625", // A080515
};

char buf[1024];

boolean testv(long a, int power) {
  mpz_t z;
  mpz_init_set_si(z, a);
  mpz_pow_ui(z, z, power);
  char *s = mpz_get_str(buf, 10, z);
  int slen = strlen(s);
  int tp, sp;
  const char *t;
  int tlen;
  t = TARGET[0];
  tlen = strlen(t);
  for (tp = 0, sp = 0; sp < slen; sp++) {
    if (s[sp] == t[tp]) {
      if (++tp == tlen) {
        printf("Bingo: A080808 %ld\n", a);
      }
    }
  }
  t = TARGET[1];
  tlen = strlen(t);
  for (tp = 0, sp = 0; sp < slen; sp++) {
    if (s[sp] == t[tp]) {
      if (++tp == tlen) {
        printf("Bingo: A080809 %ld\n", a);
      }
    }
  }
  t = TARGET[2];
  tlen = strlen(t);
  for (tp = 0, sp = 0; sp < slen; sp++) {
    if (s[sp] == t[tp]) {
      if (++tp == tlen) {
        printf("Bingo: A080812 %ld\n", a);
      }
    }
  }
  t = TARGET[3];
  tlen = strlen(t);
  for (tp = 0, sp = 0; sp < slen; sp++) {
    if (s[sp] == t[tp]) {
      if (++tp == tlen) {
        printf("Bingo: A080815 %ld\n", a);
      }
    }
  }
  mpz_clear(z);
  return false;
}

void test(long start, long end, int power) {
  long k;
  if (power < 2) {
    printf("Illegal power\n");
    return;
  }
  for (k = start; k < end; k++) {
    if (testv(k, power)) {
      printf("Bingo: %ld\n", k);
      return;
    }
  }
}

int main(int argc, char **args) {
  if (argc < 4) {
    printf("Usage: start end power\n");
  } else {
    test(atol(args[1]), atol(args[2]), atoi(args[3]));
  }
  return 0;
}

