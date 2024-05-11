package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number has nondecreasing digits.
 * @author Sean A. Irvine
 */
class DigitNondecreasing extends AbstractPredicate {

  @Override
  public boolean is(Z n) {
    Z t = Z.TEN;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      if (qr[1].compareTo(t) > 0) {
        return false;
      }
      t = qr[1];
      n = qr[0];
    }
    return true;
  }
}
