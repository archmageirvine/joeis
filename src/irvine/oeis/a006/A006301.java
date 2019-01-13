package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a269.A269920;

/**
 * A006301.
 * @author Sean A. Irvine
 */
public class A006301 extends A269920 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN + 1; ++k) {
      sum = sum.add(get(mN, 2, k));
    }
    return sum;
  }
}
