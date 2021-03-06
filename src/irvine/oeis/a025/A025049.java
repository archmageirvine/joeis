package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a059.A059882;

/**
 * A025049 Descending wiggly sums: number of sums adding to n in which terms alternately decrease and increase.
 * @author Sean A. Irvine
 */
public class A025049 extends A059882 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(mS.get(mN, k));
    }
    return sum;
  }
}
