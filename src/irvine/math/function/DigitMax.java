package irvine.math.function;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Maximum digit in a number.
 * @author Sean A. Irvine
 */
class DigitMax extends AbstractFunction2D {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public long l(final long base, Z n) {
    if (base < 2) {
      throw new IllegalArgumentException();
    }
    final Z bp = ZUtils.basePower((int) base);
    long max = 0;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(bp);
      final long v = l(base, qr[1].longValue());
      if (v > max) {
        max = v;
        if (max == base - 1) {
          return max;
        }
      }
      n = qr[0];
    }
    return max;
  }

  @Override
  public long l(final long base, long n) {
    if (base < 2) {
      throw new IllegalArgumentException();
    }
    long max = 0;
    while (n != 0) {
      final long v = n % base;
      if (v > max) {
        max = v;
        if (max == base - 1) {
          return max;
        }
      }
      n /= base;
    }
    return max;
  }

  @Override
  public Z z(final long base, final Z n) {
    return Z.valueOf(l(base, n));
  }
}
