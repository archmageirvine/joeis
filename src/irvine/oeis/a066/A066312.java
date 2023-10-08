package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066312 Numbers, other than prime powers, whose distinct prime factors are consecutive primes.
 * @author Sean A. Irvine
 */
public class A066312 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 5;

  private boolean is(final long n) {
    final Z[] p = Jaguar.factor(n).toZArray();
    if (p.length <= 1) {
      return false;
    }
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

