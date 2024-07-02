package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A071116 Least m such that sigma(n + phi(m)) = sigma(phi(m)).
 * @author Sean A. Irvine
 */
public class A071116 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    while (true) {
      final long phi = Functions.PHI.l(++m);
      if (Functions.SIGMA1.z(mN + phi).equals(Functions.SIGMA1.z(phi))) {
        return Z.valueOf(m);
      }
      if (mVerbose && m % 1000000 == 0) {
        StringUtils.message("Search completed to " + m);
      }
    }
  }
}
