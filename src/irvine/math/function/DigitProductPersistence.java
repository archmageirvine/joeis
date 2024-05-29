package irvine.math.function;

import irvine.math.z.Z;

/**
 * Digit product persistence (number of steps in digit product root).
 * @author Sean A. Irvine
 */
class DigitProductPersistence extends AbstractFunction2D {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public long l(final long base, Z n) {
    long k = 0;
    while (n.compareTo(base) >= 0) {
      n = Functions.DIGIT_PRODUCT.z(base, n);
      ++k;
    }
    return k;
  }

  @Override
  public Z z(final long base, final Z n) {
    return Z.valueOf(l(base, n));
  }
}
