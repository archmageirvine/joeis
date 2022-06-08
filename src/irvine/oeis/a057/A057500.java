package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a052.A052121;

/**
 * A057500 Number of connected labeled graphs with n edges and n nodes.
 * @author Sean A. Irvine
 */
public class A057500 extends A052121 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN * (mN - 1) / 2; ++k) {
      sum = sum.add(super.next().multiply(k));
    }
    return sum;
  }
}
