package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Test if a number is cube free.
 * @author Sean A. Irvine
 */
class CubeFree extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    return Jaguar.factor(n).maxExponent() <= 2;
  }

  @Override
  public boolean is(final long n) {
    return Jaguar.factor(n).maxExponent() <= 2;
  }
}
