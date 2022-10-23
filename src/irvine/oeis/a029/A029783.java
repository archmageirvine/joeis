package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A029783 Exclusionary squares: numbers n such that no digit of n is present in n^2.
 * @author Sean A. Irvine
 */
public class A029783 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  private static boolean isExcludedDigits(final Z n) {
    final int[] sn = ZUtils.digitCounts(n);
    final int[] sn2 = ZUtils.digitCounts(n.square());
    for (int k = 0; k < sn.length; ++k) {
      if (sn[k] > 0 && sn2[k] != 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (isExcludedDigits(mN)) {
        return mN;
      }
    }
  }
}
