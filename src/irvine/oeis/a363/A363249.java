package irvine.oeis.a363;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A064453.
 * @author Sean A. Irvine
 */
public class A363249 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    long k = 0;
    long j = 0;
    while (true) {
      k += mN;
      if (Jaguar.factor(k).sigma().subtract(2 * k).abs().equals(n)) {
        return Z.valueOf(k);
      }
      if (mVerbose && ++j % 10000000 == 0) {
        StringUtils.message("Search completed to k=" + k);
      }
    }
  }
}
