package irvine.math.predicate;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is an echo number.
 * @author Sean A. Irvine
 */
class Echo extends AbstractPredicate2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public boolean is(final long base, final Z n) {
    if (base > 36) {
      throw new UnsupportedOperationException();
    }
    final String s = n.toString((int) base);
    return s.endsWith(Long.toString(Functions.GPF.l(n.subtract(1)), (int) base));
  }

  @Override
  public boolean is(final long base, final long n) {
    if (base > 36) {
      throw new UnsupportedOperationException();
    }
    final String s = Long.toString(n, (int) base);
    return s.endsWith(Long.toString(Functions.GPF.l(n - 1), (int) base));
  }
}
