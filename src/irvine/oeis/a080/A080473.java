package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080473 a(n) = sum of the products of taking n-1 numbers from the next n numbers. The next n numbers can be grouped like this (1), (2,3), (4,5,6), (7,8,9,10),... and a(n) is the (sum of the reciprocals of all members) multiplied by (the product of all members).
 * @author Sean A. Irvine
 */
public class A080473 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long m = mN * (mN - 1) / 2 + 1;
    Z prod = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      prod = prod.multiply(m + k);
    }
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(prod.divide(m + k));
    }
    return sum;
  }
}

