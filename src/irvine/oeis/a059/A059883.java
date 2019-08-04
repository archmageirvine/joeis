package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059883 As upper right triangle: descending wiggly sums to n where first term is k (sums in which terms alternately decrease and increase; zagzig partitions).
 * @author Sean A. Irvine
 */
public class A059883 extends A059882 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mS.get(mN, mM);
  }
}
