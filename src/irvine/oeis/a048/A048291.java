package irvine.oeis.a048;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048291 Number of {0,1} n X n matrices with no zero rows or columns.
 * @author Sean A. Irvine
 */
public class A048291 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(mN, k).multiply(Z.ONE.shiftLeft(mN - k).subtract(1).pow(mN)));
    }
    return sum;
  }
}
