package irvine.math.function;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Minimum digit in a number.
 * @author Sean A. Irvine
 */
class DigitMin extends AbstractFunction2D {

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
    long min = base - 1;
    do {
      final Z[] qr = n.divideAndRemainder(bp);
      final long v = l(base, qr[1].longValue());
      if (v < min) {
        min = v;
        if (min == 0) {
          return min;
        }
      }
      n = qr[0];
    } while (!n.isZero());
    return min;
  }

  @Override
  public long l(final long base, long n) {
    if (base < 2) {
      throw new IllegalArgumentException();
    }
    long min = base - 1;
    do {
      final long v = n % base;
      if (v < min) {
        min = v;
        if (min == 0) {
          return min;
        }
      }
      n /= base;
    } while (n != 0);
    return min;
  }

  @Override
  public Z z(final long base, final Z n) {
    return Z.valueOf(l(base, n));
  }
}
