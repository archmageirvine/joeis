package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080474 a(n) = product of sum of taking n-1 numbers from the next n numbers. The next n numbers can be grouped like this (1), (2,3), (4,5,6), (7,8,9,10),... . Let N be the sum of all the members of the n-th group. Let k be a member and f(k) = N - k. Then a(n) = the product of all f(k) for k taking all member values.
 * @author Sean A. Irvine
 */
public class A080474 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final long m = mN * (mN - 1) / 2 + 1;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(m + k);
    }
    Z prod = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      prod = prod.multiply(sum.subtract(m + k));
    }
    return prod;
  }
}

