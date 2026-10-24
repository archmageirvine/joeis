package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is the power of some base number.
 * @author Georg Fischer
 */
class BasePower extends AbstractPredicate2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public boolean is(final long base, final Z n) {
    if (n.isZero()) {
      return false;
    }
    if (base == 2) {
      return n.bitCount() == 1;
    }
    Z m = n;
    while (!m.isZero()) {
      if (m.isOne()) {
        return true;
      }
      final Z[] qr = m.divideAndRemainder(base);
      if (!qr[1].isZero()) {
        return false;
      }
      m = qr[0];
    }
    return false;
  }

  @Override
  public boolean is(final long base, final long n) {
    if (n == 0L) {
      return false;
    }
    if (base == 2) {
      return Long.bitCount(n) == 1;
    }
    long m = n;
    while (m != 0) { 
      if (m == 1) {
        return true;
      }
      if (m % base != 0L) {
        return false;
      }
      m /= base;
    }
    return false;
  }
}
