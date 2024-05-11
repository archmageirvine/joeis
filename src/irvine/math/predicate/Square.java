package irvine.math.predicate;

import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * Test if a number is a square.
 * @author Sean A. Irvine
 */
class Square implements Predicate {

  @Override
  public boolean is(final Z n) {
    return n.isSquare();
  }

  @Override
  public boolean is(final long n) {
    final long s = LongUtils.sqrt(n);
    return s * s == n;
  }

  @Override
  public boolean is(final int n) {
    final int s = IntegerUtils.sqrt(n);
    return s * s == n;
  }
}
