package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075533.
 * @author Sean A. Irvine
 */
public class A075555 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (Predicates.SQUARE.is(++mN)) {
      final long s = 2 * Functions.SQRT.l(mN) + 1;
      if (!mPrime.isPrime(s)) {
        return Z.ZERO;
      }
    }
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (Predicates.SQUARE.is(p + mN)) {
        return Z.valueOf(p);
      }
    }
  }
}

