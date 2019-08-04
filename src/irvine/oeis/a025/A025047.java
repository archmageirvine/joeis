package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a059.A059882;

/**
 * A025047 Wiggly sums: number of sums adding to n in which terms alternately increase and decrease or vice versa.
 * @author Sean A. Irvine
 */
public class A025047 extends A059882 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.NEG_ONE;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(mS.get(mN, k).add(mT.get(mN, k)));
    }
    return sum;
  }
}
