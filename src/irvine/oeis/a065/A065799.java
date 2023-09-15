package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A065799 Numbers k such that k^k + k! + k^2 + k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A065799 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      final Z n = Z.valueOf(mN);
      if (n.pow(mN).add(mF).add(n.square()).add(mN + 1).isProbablePrime()) {
        return n;
      }
      if (mVerbose && mN % 100 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}
