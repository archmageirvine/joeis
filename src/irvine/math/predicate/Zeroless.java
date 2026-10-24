package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is zeroless in some base.
 * @author Georg Fischer
 */
class Zeroless extends AbstractPredicate2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public boolean is(final long base, final Z n) {
    if (n.isZero()) {
      return false;
    }
    Z m = n;
    while (!m.isZero()) {
      final Z[] qr = m.divideAndRemainder(base);
      if (qr[1].isZero()) {
        return false;
      }
      m = qr[0];
    }
    return true;
  }

  @Override
  public boolean is(final long base, final long n) {
    if (n == 0L) {
      return false;
    }
    long m = n;
    while (m != 0) {
      if (m % base == 0L) {
        return false;
      }
      m /= base;
    }
    return true;
  }
}
