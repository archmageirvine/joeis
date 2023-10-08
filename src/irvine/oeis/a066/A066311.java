package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066311 All distinct primes dividing n are consecutive.
 * @author Sean A. Irvine
 */
public class A066311 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  private boolean is(final long n) {
    final Z[] p = Jaguar.factor(n).toZArray();
    for (int k = 1; k < p.length; ++k) {
      if (!mPrime.nextPrime(p[k - 1]).equals(p[k])) {
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

