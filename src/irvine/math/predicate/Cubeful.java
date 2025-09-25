package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Test if a number is cubeful.
 * @author Sean A. Irvine
 */
class Cubeful extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    return n.isOne() || Jaguar.factor(n).minExponent() > 2;
  }

  @Override
  public boolean is(final long n) {
    return n == 1 || Jaguar.factor(n).minExponent() > 2;
  }
}
