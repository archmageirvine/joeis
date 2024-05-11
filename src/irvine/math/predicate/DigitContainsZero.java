package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number contains a zero digit.
 * @author Sean A. Irvine
 */
class DigitContainsZero extends AbstractPredicate {

  @Override
  public boolean is(Z n) {
    if (n.isZero()) {
      return true;
    }
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      if (qr[1].isZero()) {
        return true;
      }
      n = qr[0];
    }
    return false;
  }
}
