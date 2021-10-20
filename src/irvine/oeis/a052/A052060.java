package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A052060 Numbers n such that the digits of 2^n occur with the same frequency.
 * @author Sean A. Irvine
 */
public class A052060 implements Sequence {

  private int mN = -1;
  private Z mA = Z.ONE;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    while (true) {
      if (++mN > 0) {
        mA = mA.multiply2();
      }
      if (mVerbose && mN % 1000 == 0) {
        StringUtils.message("n = " + mN);
      }
      final int[] cnts = ZUtils.digitCounts(mA);
      if (A052046.isNonzeroConstant(cnts) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

