package irvine.oeis.a052;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052316 Number of labeled rooted trees with n nodes and 2-colored internal (non-leaf) nodes.
 * @author Sean A. Irvine
 */
public class A052316 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int j = 1; j <= mN; ++j) {
      sum = sum.signedAdd(((mN - j) & 1) == 0, Binomial.binomial(mN, j).multiply(Z.valueOf(j).pow(mN - 1).shiftLeft(j)));
    }
    return sum;
  }
}

