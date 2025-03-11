package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A075863 Numbers k such that phi(phi(k)) = sum of prime factors of k.
 * @author Sean A. Irvine
 */
public class A075863 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(Functions.PHI.l(++mN)).equals(Functions.SOPF.z(mN))) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 1000000 == 0) {
        StringUtils.message("search completed to " + mN);
      }
    }
  }
}
