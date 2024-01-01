package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A067633.
 * @author Sean A. Irvine
 */
public class A067651 extends A000040 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma().equals(Euler.phi(super.next().subtract(1)))) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 1000000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}
