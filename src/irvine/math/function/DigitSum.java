package irvine.math.function;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Sum of digits.
 * @author Sean A. Irvine
 */
class DigitSum extends AbstractFunction2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public long l(final long base, Z v) {
    if (base < 2) {
      throw new IllegalArgumentException();
    }
    final Z bp = ZUtils.basePower((int) base);
    long sum = 0;
    while (!v.isZero()) {
      final Z[] qr = v.divideAndRemainder(bp);
      sum += l(base, qr[1].longValue());
      v = qr[0];
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
    return Z.valueOf(l(base, n.longValueExact()));
  }
}
