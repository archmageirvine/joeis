package irvine.math.function;

import irvine.math.z.Z;

/**
 * Return a 10-bit number indicating which digits are present in a number.
 * @author Sean A. Irvine
 */
class Syndrome extends AbstractFunction1 {

  @Override
  public int i(Z n) {
    if (n.isZero()) {
      return 1;
    }
    int syndrome = 0;
    while (!n.isZero() && syndrome != 0b1111111111) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      n = qr[0];
      syndrome |= 1 << qr[1].intValue();
    }
    return syndrome;
  }

  @Override
  public int i(long n) {
    int s = 0;
    do {
      s |= 1 << (n % 10);
      n /= 10;
    } while (n != 0);
    return s;
  }

  @Override
  public Z z(final Z n) {
    return Z.valueOf(i(n.longValueExact()));
  }
}
