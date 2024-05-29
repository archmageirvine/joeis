package irvine.math.function;

import irvine.math.z.Z;

/**
 * Reverse the digits of a number.
 * @author Sean A. Irvine
 */
class Reverse extends AbstractFunction2D {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public Z z(final long base, Z n) {
    if (base < 2) {
      throw new IllegalArgumentException();
    }
    final Z b = Z.valueOf(base);
    Z r = Z.ZERO;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(b);
      r = r.multiply(base);
      r = r.add(qr[1]);
      n = qr[0];
    }
    return r;
  }

  @Override
  public long l(final long base, long n) {
    if (base < 2) {
      throw new IllegalArgumentException();
    }
    long r = 0;
    while (n != 0) {
      r *= base;
      r += n % base;
      n /= base;
    }
    return r;
  }
}
