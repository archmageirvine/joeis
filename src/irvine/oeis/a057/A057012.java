package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057012 Number of conjugacy classes of subgroups of index 6 in free group of rank n.
 * @author Sean A. Irvine
 */
public class A057012 implements Sequence {

  private static final int[] BASES = {720, 120, 36, 24, 18, 16, 12, 9, 8, 6, 4, 3, 2};
  private static final int[] MULTS = {6, -6, -3, 6, 6, -6, 12, -3, 4, -3, -9, -3, 5};
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < BASES.length; ++k) {
      sum = sum.add(Z.valueOf(BASES[k]).pow(mN).multiply(MULTS[k]));
    }
    return sum.divide(6);
  }
}
