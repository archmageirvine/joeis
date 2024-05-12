package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number has undulating digits.
 * @author Sean A. Irvine
 */
class DigitUndulate extends AbstractPredicate {

  private static final Z Z100 = Z.valueOf(100);

  @Override
  public boolean is(final Z n) {
    if (n.compareTo(Z.TEN) < 0) {
      return true;
    }
    final Z[] qr = n.divideAndRemainder(Z100);
    final int ab = qr[1].intValue();
    int a = ab % 10;
    int b = ab / 10;
    if (a == b) {
      return false;
    }
    boolean dir = a < b;
    Z m = qr[0];
    while (!m.isZero()) {
      final Z[] t = m.divideAndRemainder(Z.TEN);
      a = b;
      b = t[1].intValue();
      if (a == b || a < b == dir) {
        return false;
      }
      m = t[0];
      dir = !dir;
    }
    return true;
  }
}
