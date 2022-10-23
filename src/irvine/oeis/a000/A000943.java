package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000943 Number of combinatorial types of simplicial n-dimensional polytopes with n+3 nodes.
 * @author Sean A. Irvine
 */
public class A000943 extends Sequence1 {

  private int mN = 4;

  @Override
  public Z next() {
    ++mN;
    Z c = Z.ZERO;
    for (int d = 1; d <= mN; ++d) {
      if ((d & 1) == 1 && mN % d == 0) {
        c = c.add(Z.valueOf(LongUtils.phi(d)).shiftLeft(mN / d));
      }
    }
    c = c.divide(4L * mN);
    return Z.ONE.shiftLeft((mN - 3) / 2).subtract((mN + 1) / 2).add(c);
  }
}
