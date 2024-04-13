package irvine.math.function;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Product of digits.
 * @author Sean A. Irvine
 */
class DigitProduct extends AbstractFunction2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public Z z(final long base, Z v) {
    if (base < 2) {
      throw new IllegalArgumentException();
    }
    if (v.isZero()) {
      return Z.ZERO;
    }
    final Z bp = ZUtils.basePower((int) base);
    Z prod = Z.ONE;
    while (!v.isZero() && !prod.isZero()) {
      final Z[] qr = v.divideAndRemainder(bp);
      v = qr[0];
      if (!v.isZero() && qr[1].multiply(base).compareTo(bp) < 0) {
        return Z.ZERO; // Deal with situation where block has a leading 0
      }
      prod = prod.multiply(l(base, qr[1].longValue()));
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
      p *= m % base;
      m /= base;
    } while (m != 0 && p != 0);
    return p;
  }
}
