package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A067864.
 * @author Sean A. Irvine
 */
public class A067864 implements Sequence {

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

