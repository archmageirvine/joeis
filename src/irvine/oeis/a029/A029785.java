package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A029785 Numbers k whose cube <code>k^3</code> has no digit in common with k.
 * @author Sean A. Irvine
 */
public class A029785 implements Sequence {

  private Z mN = Z.NEG_ONE;

  private static boolean isExcludedDigits(final Z n) {
    final int[] sn = ZUtils.digitCounts(n);
    final int[] sn3 = ZUtils.digitCounts(n.pow(3));
    for (int k = 0; k < sn.length; ++k) {
      if (sn[k] > 0 && sn3[k] != 0) {
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
