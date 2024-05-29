package irvine.math.function;

import irvine.math.z.Z;

/**
 * Rotate a number by one digit to the right.
 * @author Sean A. Irvine
 */
class RotateRight extends AbstractFunction2D {

  @Override
  public long getDefault() {
    return 10; // Decimal
  }

  @Override
  public Z z(final long base, final Z n) {
    if (base < 2) {
      throw new IllegalArgumentException();
    }
    final Z[] qr = n.divideAndRemainder(Z.valueOf(base));
    if (qr[1].isZero()) {
      return qr[0];
    }
    Z mul = Z.ONE;
    while (mul.compareTo(qr[0]) <= 0) {
      mul = mul.multiply(base);
    }
    return qr[1].multiply(mul).add(qr[0]);
  }
}
