package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is a palindrome.
 * @author Sean A. Irvine
 */
class Repdigit extends AbstractPredicate2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public boolean is(final long base, final Z n) {
    if (n.compareTo(base) < 0) {
      return true;
    }
    final Z[] t = n.divideAndRemainder(base);
    final Z r = t[1];
    Z m = t[0];
    while (!m.isZero()) {
      final Z[] qr = m.divideAndRemainder(base);
      if (!qr[1].equals(r)) {
        return false;
      }
      m = qr[0];
    }
    return true;
  }

  @Override
  public boolean is(final long base, final long n) {
    if (n < base) {
      return true;
    }
    final long r = n % base;
    long m = n / base;
    while (m != 0) {
      if (m % base != r) {
        return false;
      }
      m /= base;
    }
    return true;
  }
}
