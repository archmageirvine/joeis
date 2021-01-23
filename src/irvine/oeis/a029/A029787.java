package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A029787 Numbers n such that digits of n^2 are not present in n^3.
 * @author Sean A. Irvine
 */
public class A029787 implements Sequence {

private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private Z mN = Z.NEG_ONE;

  private static boolean isExcludedDigits(final Z n) {
    final int[] sn2 = ZUtils.digitCounts(n.square());
    final int[] sn3 = ZUtils.digitCounts(n.pow(3));
    for (int k = 0; k < sn2.length; ++k) {
      if (sn2[k] > 0 && sn3[k] != 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mVerbose && mN.mod(1000000) == 0) {
        StringUtils.message("n=" + mN);
      }
      if (isExcludedDigits(mN)) {
        return mN;
      }
    }
  }
}
