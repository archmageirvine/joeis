package irvine.math.function;

import irvine.math.z.Z;

/**
 * Rotate a number by one digit to the left.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
class RotateLeft extends AbstractFunction2D {

  @Override
  public long getDefault() {
    return 10; // Decimal
  }

  @Override
  public Z z(final long base, final Z n) {
    if (base < 2) {
      throw new IllegalArgumentException();
    }
    if (n.compareTo(Z.valueOf(base)) < 0) {
      return n;
    }
    Z mul = Z.ONE;
    int sign;
    while ((sign = mul.compareTo(n)) < 0) {
      mul = mul.multiply(base);
    }
    if (sign == 0) { // n is a power of base
      return Z.ONE;
    }
    mul = mul.divide(base);
    final Z[] qr = n.divideAndRemainder(mul);
    return qr[1].multiply(base).add(qr[0]);
  }
}
