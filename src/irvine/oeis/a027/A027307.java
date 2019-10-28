package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027307 Number of paths from <code>(0,0)</code> to <code>(3n,0)</code> that stay in first quadrant (but may touch horizontal axis) and where each step is <code>(2,1), (1,2)</code> or <code>(1,-1)</code>.
 * @author Sean A. Irvine
 */
public class A027307 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(Binomial.binomial(2 * mN, k).multiply(Binomial.binomial(mN, k + 1)).shiftLeft(k + 1));
    }
    return sum.divide(mN);
  }
}
