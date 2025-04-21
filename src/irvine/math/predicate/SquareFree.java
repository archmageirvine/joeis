package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Test if a number is square free.
 * @author Sean A. Irvine
 */
class SquareFree extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    return !n.isZero() && Jaguar.factor(n).maxExponent() <= 1;
  }

  @Override
  public boolean is(final long n) {
    return n != 0 && Jaguar.factor(n).maxExponent() <= 1;
  }
}
