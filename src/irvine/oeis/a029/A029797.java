package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A029797 Numbers k such that k^2 and k^3 have the same set of digits.
 * @author Sean A. Irvine
 */
public class A029797 implements Sequence {

  private Z mN = Z.NEG_ONE;

  private static boolean isDigitMatch(final Z n) {
    final int[] sn2 = ZUtils.digitCounts(n.square());
    final int[] sn3 = ZUtils.digitCounts(n.pow(3));
    for (int k = 0; k < sn2.length; ++k) {
      if (sn2[k] > 0 ^ sn3[k] > 0) {
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
