package irvine.oeis.a390;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A390467 allocated for C\u00e9sar Mart\u00ednez.
 * @author Sean A. Irvine
 */
public class A390467 extends A000032 {

  private final Fast mPrime = new Fast();
  private long mN = 7;

  private boolean is(final long n) {
    if (mPrime.isPrime(n)) {
      return false;
    }
    for (long p = mPrime.nextPrime(2 * n / 3); p < n; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(2 * p - n) && mPrime.isPrime(3 * p - 2 * mN)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
