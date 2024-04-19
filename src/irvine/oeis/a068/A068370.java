package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068370 Numbers n such that positive values of n-(k!) are all primes (k&gt;1).
 * @author Sean A. Irvine
 */
public class A068370 extends Sequence1 {

  private final Fast mFast = new Fast();
  private long mN = 1;

  private boolean is(final long n) {
    for (int k = 2; Functions.FACTORIAL.l(k) < n; ++k) {
      if (!mFast.isPrime(n - Functions.FACTORIAL.l(k))) {
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

