package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027307 Number of paths from (0,0) to (3n,0) that stay in first quadrant (but may touch horizontal axis) and where each step is (2,1), (1,2) or (1,-1).
 * @author Sean A. Irvine
 */
public class A027307 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(Binomial.binomial(2L * mN, k).multiply(Binomial.binomial(mN, k + 1)).shiftLeft(k + 1));
    }
    return sum.divide(mN);
  }
}
