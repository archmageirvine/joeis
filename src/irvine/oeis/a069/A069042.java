package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000364;
import irvine.util.string.StringUtils;

/**
 * A069036.
 * @author Sean A. Irvine
 */
public class A069042 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Sequence mB = new A000364().skip();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mB.next().mod(++mN * mN) == 1) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 100 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}

