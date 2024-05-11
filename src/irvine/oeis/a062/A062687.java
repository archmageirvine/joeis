package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A062687 Numbers all of whose divisors are palindromic.
 * @author Sean A. Irvine
 */
public class A062687 extends A002113 {

  {
    super.next();
  }

  private boolean is(final Z p) {
    for (final Z d : Jaguar.factor(p).divisors()) {
      if (!Predicates.PALINDROME.is(10, d)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
