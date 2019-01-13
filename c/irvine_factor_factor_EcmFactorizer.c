#include <jni.h>
#include <stdlib.h>
#include <ecm.h>
#include <gmp.h>
#include "irvine_factor_factor_EcmFactorizer.h"

JNIEXPORT jstring JNICALL Java_irvine_factor_factor_EcmFactorizer_jecm(JNIEnv *env, jobject obj, jstring jnum, jdouble b1) {
  const char *num = (*env)->GetStringUTFChars(env, jnum, NULL);
  mpz_t n;
  mpz_t f;
  int res;
  mpz_init(n);
  mpz_init(f);
  if (mpz_set_str(n, num, 10)) {
    fprintf(stderr, "Invalid number: %s\n", num);
    return NULL;
  }
  res = ecm_factor(f, n, b1, NULL);
  if (res <= 0) {
    if (res < 0) {
      fprintf(stderr, "ECM error on: %s\n", num);
    }
    return NULL;
  }
  char *ff = mpz_get_str(NULL, 10, f);
  jstring j_factor = (*env)->NewStringUTF(env, ff);
  free(ff);
  mpz_clear(n);
  mpz_clear(f);
  (*env)->ReleaseStringUTFChars(env, jnum, num);
  return j_factor;
}
