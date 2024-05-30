package irvine.math.predicate;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is a square.
 * @author Sean A. Irvine
 */
class Square extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    return n.isSquare();
  }

  @Override
  public boolean is(final long n) {
    final long s = Functions.SQRT.l(n);
    return s * s == n;
  }

  @Override
  public boolean is(final int n) {
    final int s = Functions.SQRT.i(n);
    return s * s == n;
  }
}
