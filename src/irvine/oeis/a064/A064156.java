package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064156 Smallest prime with n decimal digits such that the product of its digits equals n times the sum of its digits, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A064156 extends Sequence1 {

  private int mN = 0;
  private long mLimit = 0;

  private Z search(final Z v, final int digits, final long product, final long sum) {
    if (digits >= mN) {
      return product == mN * sum && v.isProbablePrime() ? v : Z.ZERO;
    }
    final Z v10 = v.multiply(10);
    for (int digit = 1; digit <= 9; ++digit) {
      final long newProduct = product * digit;
      if (newProduct > mLimit) {
        break;
      }
      final Z res = search(v10.add(digit), digits + 1, newProduct, sum + digit);
      if (!res.isZero()) {
        return res;
      }
    }
    return Z.ZERO;
  }

  @Override
  public Z next() {
    ++mN;

    // We can never achieve a product that requires a prime factor > 7
    if (Functions.GPF.z(mN).compareTo(Z.SEVEN) > 0) {
      return Z.ZERO;
    }

    // There must be some other smart way to eliminate others 0 such as n=35, n=49, n=54.

    mLimit = 9L * mN * mN; // n times sum of n 9's
    return search(Z.ZERO, 0, 1, 0);
  }
}
