package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A067207 Numbers k such that the digits of sigma_2(k) end in k.
 * @author Sean A. Irvine
 */
public class A067207 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = String.valueOf(++mN);
      final String p = Jaguar.factor(mN).sigma2().toString();
      if (p.endsWith(s)) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 1000000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}
