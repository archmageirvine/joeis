package irvine.oeis.a380;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075078.
 * @author Sean A. Irvine
 */
public class A380436 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n, final Z sumSquares) {
    if (Predicates.SQUARE.is(sumSquares.add(n * n))) {
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

