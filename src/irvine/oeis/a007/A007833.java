package irvine.oeis.a007;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007833 Number of point-labeled reduced two-graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A007833 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Stirling.firstKind(mN, k).shiftLeft((k - 1) * (k - 2) / 2));
    }
    return sum;
  }
}
