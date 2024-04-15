package irvine.math.function;

import irvine.math.z.Z;

/**
 * Nonzero digit product of root.
 * @author Sean A. Irvine
 */
class DigitNonzeroProductRoot extends AbstractFunction2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public long l(final long base, final long n) {
    long root = Functions.DIGIT_NZ_PRODUCT.l(base, n);
    while (root >= base) {
      root = Functions.DIGIT_NZ_PRODUCT.l(base, root);
    }
    return root;
  }

  @Override
  public Z z(final long base, final Z n) {
    Z root = Functions.DIGIT_NZ_PRODUCT.z(base, n);
    final Z zb = Z.valueOf(base);
    while (root.compareTo(zb) >= 0) {
      root = Functions.DIGIT_NZ_PRODUCT.z(base, root);
    }
    return root;
  }
}
