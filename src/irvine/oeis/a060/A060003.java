package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060003 Odd numbers not of the form p + 2*k^2, k&gt;0, p prime.
 * @author Sean A. Irvine
 */
public class A060003 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  private boolean is(final long n) {
    for (long j, k = 1; (j = n - 2 * k * k) > 1; ++k) {
      if (mPrime.isPrime(j)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
