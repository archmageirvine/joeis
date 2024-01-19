package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A067999 Numbers k such that (k! - 1) == 0 (mod prime(k)).
 * @author Sean A. Irvine
 */
public class A067999 extends A000040 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long m = super.next().longValueExact();
      long f = 1;
      for (long k = 2; k <= mN; ++k) {
        f *= k;
        f %= m;
      }
      if (f == 1) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 100000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}

