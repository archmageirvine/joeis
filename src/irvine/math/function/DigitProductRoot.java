package irvine.math.function;

import irvine.math.z.Z;

/**
 * Digit product root.
 * @author Sean A. Irvine
 */
class DigitProductRoot extends AbstractFunction2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public long l(final long base, final long n) {
    long root = n;
    while (root >= base) {
      root = Functions.DIGIT_PRODUCT.l(base, root);
    }
    return root;
  }

  @Override
  public Z z(final long base, final Z n) {
    Z root = n;
    final Z zb = Z.valueOf(base);
    while (root.compareTo(zb) >= 0) {
      root = Functions.DIGIT_PRODUCT.z(base, root);
    }
    return root;
  }
}
