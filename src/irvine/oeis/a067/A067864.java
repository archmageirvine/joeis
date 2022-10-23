package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A067864 Numbers k such that k divides the sum of digits of 6^k.
 * @author Sean A. Irvine
 */
public class A067864 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;
  private Z mZ = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mZ = mZ.multiply(6);
      if (ZUtils.digitSum(mZ) % ++mN == 0) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 1000 == 0) {
        System.err.println("[" + mN + "]");
      }
    }
  }
}

