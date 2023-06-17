package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.util.string.StringUtils;

/**
 * A029790 None of the digits in n is present in n^2 or n^3.
 * @author Sean A. Irvine
 */
public class A029790 extends AbstractSequence {

  /* Construct the sequence. */
  public A029790() {
    super(1);
  }

private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private Z mN = Z.NEG_ONE;

  private static boolean isExcludedDigits(final Z n) {
    final int[] sn = ZUtils.digitCounts(n);
    final int[] sn2 = ZUtils.digitCounts(n.square());
    final int[] sn3 = ZUtils.digitCounts(n.pow(3));
    for (int k = 0; k < sn2.length; ++k) {
      if (sn[k] > 0 && (sn2[k] != 0 || sn3[k] != 0)) {
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
