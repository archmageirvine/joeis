package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number has alternating digit parity.
 * @author Sean A. Irvine
 */
class DigitAlternatingParity extends AbstractPredicate2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public boolean is(final long base, final Z n) {
    Z m = n;
    boolean first = true;
    boolean parity = true;
    while (!m.isZero()) {
      final Z[] qr = m.divideAndRemainder(base);
      final boolean bit = qr[1].testBit(0);
      if (first) {
        first = false;
        parity = bit;
      } else if (parity == bit) {
        return false;
      } else {
        parity = !parity;
      }
      m = qr[0];
    }
    return true;
  }
}
