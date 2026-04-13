package irvine.oeis.a394;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394621 allocated for Bill McEachen.
 * @author Sean A. Irvine
 */
public class A394621 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  private boolean isSumSquares(final long n) {
    for (long x = 0; 2 * x * x <= n; ++x) {
      if (Predicates.SQUARE.is(n - x * x)) {
        return true;
      }
    }
    return false;
  }

  private boolean is(final long n) {
    for (long p1 = 2; p1 * p1 <= n; p1 = mPrime.nextPrime(p1)) {
      if (mPrime.isPrime(n - p1) && isSumSquares(n - p1 * p1)) {
        return true;
      }
    }
    return false;
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
