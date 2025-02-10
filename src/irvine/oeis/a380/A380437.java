package irvine.oeis.a380;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A380437 Integers with at least 1 proper factorization for which the sum of the squares of the factors is a square, whose square root is also a factor of that number.
 * @author Sean A. Irvine
 */
public class A380437 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n, final Z sumSquares) {
    // Note mN is not the same as n in this next test
    final Z ss = sumSquares.add(n * n);
    if (Predicates.SQUARE.is(ss) && mN % ss.sqrt().longValueExact() == 0) {
      return true;
    }
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValue();
      if (d != 1 && 2 * d <= n && is(n / d, sumSquares.add(d * d))) {
        return true;
      }
    }
    return false;
  }

  private boolean is(final long n) {
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValue();
      if (d != 1 && 2 * d <= n && is(n / d, Z.valueOf(d * d))) {
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

