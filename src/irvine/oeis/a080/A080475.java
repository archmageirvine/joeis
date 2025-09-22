package irvine.oeis.a080;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080454.
 * @author Sean A. Irvine
 */
public class A080475 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private boolean is(final long n) {
    for (long p = 2; p < n; p = mPrime.nextPrime(p)) {
      if (Predicates.BRILLIANT.is(n - p)) {
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

