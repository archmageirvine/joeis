package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A038536 Odd values of n &gt; 1 for which there are n-hyperperfect numbers.
 * @author Sean A. Irvine
 */
public class A038536 implements Sequence {

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
        final long sigma = Jaguar.factor(m).sigma().longValueExact();
        final long s = sigma - m - 1;
        if (mN * s == m - 1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
