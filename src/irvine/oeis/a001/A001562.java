package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001562 Numbers n such that (10^n + 1)/11 is a prime.
 * @author Sean A. Irvine
 */
public class A001562 extends Sequence1 {

  private long mN = 3;
  private Z mTen = Z.valueOf(1000);
  private final Fast mPrime = new Fast();

  // All prime factors of b^n+1 have the form p = 2kn+1.
  // See if we can eliminate a candidate quickly by finding a small factor
  private boolean survivesQuickCheck(final Z q, final long n) {
    if (n < 50) {
      // Don't do this test for small cases where p == q could occur.
      return true;
    }
    for (long p = 2 * n + 1; p < 50000; p += n) {
      if (p != 11 && mPrime.isPrime(p) && q.mod(p) == 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    // All values in this sequence must have prime exponents
    while (true) {
      long u = 1;
      boolean p;
      do {
        u *= 100L;
        mN += 2;
      } while (!(p = mPrime.isPrime(mN)) && u < 1000000000000000000L);
      mTen = mTen.multiply(u);
      if (p) {
        final Z h = mTen.add(1);
        if (survivesQuickCheck(h, mN) && h.divide(11).isProbablePrime()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
