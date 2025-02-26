package irvine.oeis.a075;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075533.
 * @author Sean A. Irvine
 */
public class A075556 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (Predicates.SQUARE.is(++mN)) {
      final long s = 2 * Functions.SQRT.l(mN) + 1;
      if (!mPrime.isPrime(s)) {
        return Z.ZERO;
      }
      if (mUsed.add(s)) {
        return Z.valueOf(s);
      }
      return Z.ZERO;
    }
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (Predicates.SQUARE.is(p + mN) && mUsed.add(p)) {
        return Z.valueOf(p);
      }
    }
  }
}

