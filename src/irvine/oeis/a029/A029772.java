package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A029772 Every digit that appears in k also appears at least once in k^2.
 * @author Sean A. Irvine
 */
public class A029772 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  private static boolean isDigitMatch(final Z n) {
    final int[] sn = ZUtils.digitCounts(n);
    final int[] sn2 = ZUtils.digitCounts(n.square());
    for (int k = 0; k < sn.length; ++k) {
      if (sn[k] > 0 && sn2[k] == 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (isDigitMatch(mN)) {
        return mN;
      }
    }
  }
}
