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
    // Quick tests first to eliminate a lot of cases
    if (!n.testBit(0) && !n.testBit(1) || n.mod(9) == 0 || n.mod(25) == 0 || n.mod(49) == 0) {
      return false;
    }
    return Jaguar.factor(n).maxExponent() <= 1;
  }

  @Override
  public boolean is(final long n) {
    // Quick tests first to eliminate a lot of cases
    if ((n & 3) == 0 || n % 9 == 0 || n % 25 == 0 || n % 49 == 0) {
      return false;
    }
    return Jaguar.factor(n).maxExponent() <= 1;
  }
}
