package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a026.A026906;
import irvine.util.string.StringUtils;

/**
 * A058858 Numbers k that divide the sum of the first k unique partition numbers (A000009).
 * @author Sean A. Irvine
 */
public class A058858 extends A026906 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 100000 == 0) {
        StringUtils.message("Search complete to " + mN);
      }
    }
  }
}
