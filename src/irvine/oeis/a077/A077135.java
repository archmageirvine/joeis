package irvine.oeis.a077;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A077094.
 * @author Sean A. Irvine
 */
public class A077135 extends A002808 {

  private boolean is(final Z n) {
    for (final Z dd : Jaguar.factor(n).divisors()) {
      if (!dd.equals(n)) {
        final long d = dd.longValue();
        if (d != 1 && !Predicates.PRIME.is(d | 1)) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (is(c)) {
        return c;
      }
    }
  }
}

