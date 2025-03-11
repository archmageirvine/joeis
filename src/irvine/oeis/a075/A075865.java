package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A075865 Numbers n such that phi(n) = sigma(sum of distinct prime factors of n).
 * @author Sean A. Irvine
 */
public class A075865 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 17;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(++mN).equals(Functions.SIGMA1.z(Functions.SOPF.z(mN)))) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 1000000 == 0) {
        StringUtils.message("search completed to " + mN);
      }
    }
  }
}
