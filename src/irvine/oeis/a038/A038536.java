package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A038536 Odd values of n &gt; 1 for which there are n-hyperperfect numbers.
 * @author Sean A. Irvine
 */
public class A038536 extends Sequence1 {

  // WARNING: This is not very good.

  private static final long HEURISTIC_LIMIT = 100000;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mVerbose) {
        StringUtils.message("Trying: " + mN);
      }
      for (long m = 2; m <= HEURISTIC_LIMIT * mN; ++m) {
        final long sigma = Functions.SIGMA.z(m).longValueExact();
        final long s = sigma - m - 1;
        if (mN * s == m - 1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
