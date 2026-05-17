package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is a repeated unit.
 * @author Sean A. Irvine
 */
class Repunit extends AbstractPredicate2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public boolean is(final long base, final Z n) {
    if (n.compareTo(base) < 0) {
      return n.isOne();
    }
    Z m = n;
    while (!m.isOne()) {
      final Z[] qr = m.divideAndRemainder(base);
      if (!qr[1].isOne()) {
        return false;
      }
      m = qr[0];
    }
    return true;
  }

  @Override
  public boolean is(final long base, final long n) {
    if (n < base) {
      return n == 1;
    }
    long m = n;
    while (m != 1) {
      if (m % base != 1) {
        return false;
      }
      m /= base;
    }
    return true;
  }
}
