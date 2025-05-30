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
    // Quick test for multiples of 4
    if (!n.testBit(0) && !n.testBit(1)) {
      return false;
    }
    return !n.isZero() && Jaguar.factor(n).maxExponent() <= 1;
  }

  @Override
  public boolean is(final long n) {
    // Quick test for multiples of 4
    if ((n & 3) == 0) {
      return false;
    }
    return n != 0 && Jaguar.factor(n).maxExponent() <= 1;
  }
}
