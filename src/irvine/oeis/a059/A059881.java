package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059881 As upper right triangle: wiggly sums to n where first term is k (sums in which terms alternately increase and decrease or vice versa; zigzag and zagzig partitions).
 * @author Sean A. Irvine
 */
public class A059881 extends A059882 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mM == mN ? Z.ONE : mS.get(mN, mM).add(mT.get(mN, mM));
  }
}
