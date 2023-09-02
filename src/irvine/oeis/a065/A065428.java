package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065428 Numbers k such that no x^2 mod k is prime.
 * @author Sean A. Irvine
 */
public class A065428 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private boolean is(final long n) {
    for (long k = 2; k < n; ++k) {
      if (mPrime.isPrime(LongUtils.modPow(k, 2, mN))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
