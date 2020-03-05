package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A029778 Digits of <code>n^3</code> appear in <code>n</code>.
 * @author Sean A. Irvine
 */
public class A029778 implements Sequence {

  private Z mN = Z.NEG_ONE;

  private static boolean isDigitMatch(final Z n) {
    final int[] sn = ZUtils.digitCounts(n);
    final int[] sn3 = ZUtils.digitCounts(n.pow(3));
    for (int k = 0; k < sn.length; ++k) {
      if (sn3[k] > 0 && sn[k] == 0) {
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
