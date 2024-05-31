package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007833 Number of point-labeled reduced two-graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A007833 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Functions.STIRLING1.z(mN, k).shiftLeft((long) (k - 1) * (k - 2) / 2));
    }
    return sum;
  }
}
