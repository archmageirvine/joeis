package irvine.math.function;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Sum of the squares of the digits in a number.
 * @author Sean A. Irvine
 */
class DigitSumSquares extends AbstractFunction2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public long l(final long base, final Z n) {
    if (base < 2) {
      throw new IllegalArgumentException();
    }
    return ZUtils.digitSumPower(n, (int) base, 2);
  }

  @Override
  public long l(final long base, long n) {
    if (base < 2) {
      throw new IllegalArgumentException();
    }
    long sum = 0;
    while (n != 0) {
      final long t = n % base;
      sum += t * t;
      n /= base;
    }
    return sum;
  }

  @Override
  public Z z(final long base, final Z n) {
    return Z.valueOf(l(base, n));
  }
}
