#include <gmp.h>
#include <stdio.h>
#include <stdlib.h>

int bingo(mpz_t z, unsigned int n) {
  mpz_t r;
  int rem;
  if ((n & 1) == 0 && mpz_odd_p(z)) {
      return 0;
  }
  mpz_init(r);
  rem = mpz_mod_ui(r, z, n);
  mpz_clear(r);
  return rem == 0;
}

int main(int argc, char **argv) {
  unsigned int skip = argc > 1 ? atoi(argv[1]) : 0;
  unsigned int n = 0;
  mpz_t c;
  mpz_init(c);
  while (++n > 0) {
    if (n % 100000 == 0) {
      printf("[%d]\n", n);
      fflush(stdout);
    }
    unsigned int x = n;
    unsigned long y = 0;
    int len = 0;
    while ((x & 7) == 0) {
      x >>= 3;
    }
    while (x != 0) {
      y <<= 3;
      y |= x & 7;
      x >>= 3;
      len += 3;
    }
    mpz_mul_2exp(c, c, len);
    mpz_add_ui(c, c, y);
    if (n > skip && bingo(c, n)) {
      printf("%d\n", n);
      fflush(stdout);
    }
  }
  mpz_clear(c);
  return 0;
}


