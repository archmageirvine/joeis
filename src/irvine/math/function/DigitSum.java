package irvine.math.function;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Sum of digits.
 * @author Sean A. Irvine
 */
class DigitSum extends AbstractFunction2D {

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
    long sum = 0;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(bp);
      sum += l(base, qr[1].longValue());
      n = qr[0];
    }
    return sum;
  }

  @Override
  public long l(final long base, long n) {
    if (base < 2) {
      throw new IllegalArgumentException();
    }
    long sum = 0;
    while (n != 0) {
      sum += n % base;
      n /= base;
    }
    return sum;
  }

  @Override
  public Z z(final long base, final Z n) {
    return Z.valueOf(l(base, n));
  }
}
