package irvine.math.function;

import irvine.math.z.Z;

/**
 * Product of nonzero digits.
 * @author Sean A. Irvine
 */
class DigitNonzeroProduct extends AbstractFunction2D {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public Z z(final long base, Z n) {
    if (base < 2) {
      throw new IllegalArgumentException();
    }
    final Z bp = Z.valueOf(base);
    Z prod = Z.ONE;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(bp);
      if (! qr[1].isZero()) {
        prod = prod.multiply(qr[1]);
      }
      n = qr[0];
    }
    return prod;
  }

  @Override
  public long l(final long base, final long n) {
    if (base < 2) {
      throw new IllegalArgumentException();
    }
    long m = Math.abs(n);
    long p = 1;
    do {
      final long r = m % base;
      if (r != 0) {
        p *= r;
      }
      m /= base;
    } while (m != 0);
    return p;
  }
}
