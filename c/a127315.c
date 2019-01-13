#include <gmp.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char **args) {
  long mN = 1;
  printf("1\n");
  mpz_t n, nn, n4, nineteen, r;
  mpz_init_set_si(nineteen, 19);
  mpz_init(n);
  mpz_init(nn);
  mpz_init(n4);
  mpz_init(r);
  while (1) {
    mpz_set_si(n, ++mN);
    mpz_mul(nn, n, n);
    mpz_mul(n4, nn, nn);
    mpz_powm(r, nineteen, nn, n4);
    if (mpz_cmp_si(r, 1) == 0) {
      printf("%ld\n", mN);
      fflush(stdout);
    }
  }
}
