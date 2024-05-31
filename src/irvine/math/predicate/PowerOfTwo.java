package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is a power of 2.
 * @author Sean A. Irvine
 */
class PowerOfTwo extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    return n.bitCount() == 1;
  }

  @Override
  public boolean is(final long n) {
    return n > 0 && (n & (n - 1)) == 0;
  }

  @Override
  public boolean is(final int n) {
    return n > 0 && (n & (n - 1)) == 0;
  }
}
