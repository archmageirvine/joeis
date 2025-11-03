package irvine.oeis.a390;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390181 allocated for Husnain Raza.
 * @author Sean A. Irvine
 */
public class A390181 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private boolean is(final long n) {
    for (long p = 2; p * p <= n; p = mPrime.nextPrime(p)) {
      if (n % (p * p) < p) {
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
