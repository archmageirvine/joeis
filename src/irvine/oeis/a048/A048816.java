package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a244.A244925;

/**
 * A048816 Number of rooted trees with n nodes with every leaf at the same height.
 * @author Sean A. Irvine
 */
public class A048816 extends A244925 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
