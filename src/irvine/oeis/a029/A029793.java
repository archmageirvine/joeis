package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A029793 Numbers n such that n and n^2 have the same set of digits.
 * @author Sean A. Irvine
 */
public class A029793 implements Sequence {

  private Z mN = Z.NEG_ONE;

  private static boolean isDigitMatch(final Z n) {
    final int[] sn = ZUtils.digitCounts(n);
    final int[] sn2 = ZUtils.digitCounts(n.square());
    for (int k = 0; k < sn.length; ++k) {
      if (sn[k] > 0 ^ sn2[k] > 0) {
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
