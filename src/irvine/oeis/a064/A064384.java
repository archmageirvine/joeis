package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A064379.
 * @author Sean A. Irvine
 */
public class A064384 extends A000040 {

  private static final int PROGRESS_REPORTING = 10000;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mM = 0;

  @Override
  public Z next() {
    while (true) {
      long p = super.next().longValueExact();
      long s = 1 % p;
      long f = 1;
      long sign = -1;
      for (long k = 1; k < p; ++k, sign = -sign) {
        f *= k;
        f %= p;
        if (f == 0) {
          break;
        }
        s += sign * f;
        s %= p;
      }
      if (mVerbose && ++mM >= PROGRESS_REPORTING) {
        StringUtils.message("searched to " + p);
        mM = 0;
      }
      if (s == 0) {
        return Z.valueOf(p);
      }
    }
  }
}
