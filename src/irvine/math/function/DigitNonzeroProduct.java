package irvine.math.function;

import irvine.math.z.Z;

/**
 * Product of nonzero digits.
 * @author Sean A. Irvine
 */
class DigitNonzeroProduct extends AbstractFunction2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public Z z(final long base, Z v) {
    if (base < 2) {
      throw new IllegalArgumentException();
    }
    final Z bp = Z.valueOf(base);
    Z prod = Z.ONE;
    while (!v.isZero()) {
      final Z[] qr = v.divideAndRemainder(bp);
      if (! qr[1].isZero()) {
        prod = prod.multiply(qr[1]);
      }
      v = qr[0];
    }
    return prod;
  }

  @Override
  public long l(final long base, long n) {
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
