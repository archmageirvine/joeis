package irvine.math.function;

import irvine.math.z.Z;

/**
 * Number of digits in the number.
 * @author Sean A. Irvine
 */
class DigitLength extends AbstractFunction2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public long l(final long base, Z n) {
    if (base <= 2) {
      if (base < 2) {
        throw new IllegalArgumentException();
      }
      return n.bitLength();
    }
    if (n.isZero()) {
      return 1;
    }
    long cnt = 0;
    final Z bp = Z.valueOf(base);
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(bp);
      n = qr[0];
      ++cnt;
    }
    return cnt;
  }

  @Override
  public Z z(final long base, final Z n) {
    return Z.valueOf(l(base, n));
  }
}
