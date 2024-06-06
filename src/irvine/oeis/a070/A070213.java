package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A070213 Numbers k such that A056542(k) is prime.
 * @author Sean A. Irvine
 */
public class A070213 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 1;
  private Z mB = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mB = mB.multiply(++mN).add(1);
      if (mB.isProbablePrime()) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 100 == 0) {
        StringUtils.message("Search completed to n=" + mN);
      }
    }
  }
}
