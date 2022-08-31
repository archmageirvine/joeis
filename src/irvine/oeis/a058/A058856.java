package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a026.A026905;
import irvine.util.string.StringUtils;

/**
 * A058856 Numbers k that divide the sum of the partition numbers to k.
 * @author Sean A. Irvine
 */
public class A058856 extends A026905 {

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
