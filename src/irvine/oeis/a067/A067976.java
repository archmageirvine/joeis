package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A067976 Primes of the form 1 + k^phi(k).
 * @author Sean A. Irvine
 */
public class A067976 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).pow(Functions.PHI.z(mN)).add(1);
      if (t.isProbablePrime()) {
        if (mVerbose) {
          StringUtils.message("Found solution with n=" + mN);
        }
        return t;
      }
      if (mVerbose && mN % 100 == 0) {
        StringUtils.message("Search completed to n=" + mN);
      }
    }
  }
}
