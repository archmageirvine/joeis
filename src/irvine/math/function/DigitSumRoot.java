package irvine.math.function;

import irvine.math.z.Z;

/**
 * Digit sum root.
 * @author Sean A. Irvine
 */
class DigitSumRoot extends AbstractFunction2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public long l(final long base, final long n) {
    return n < base ? n : l(Functions.DIGIT_SUM.l(base, n));
  }

  @Override
  public long l(final long base, final Z n) {
    return n.compareTo(base) < 0 ? n.longValue() : l(Functions.DIGIT_SUM.l(base, n));
  }

  @Override
  public Z z(final long base, final Z n) {
    return Z.valueOf(l(base, n));
  }
}
