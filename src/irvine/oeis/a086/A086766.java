package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A086766 a(n) = smallest r where (concatenation of n, r times with itself)*10 + 1 is a prime given by A087403(n), or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A086766 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;
  private long mLim = 10;

  @Override
  public Z next() {
    if (++mN >= mLim) {
      mLim *= 10;
    }
    Z t = Z.valueOf(mN);
    long r = 1;
    while (true) {
      if (t.multiply(10).add(1).isProbablePrime()) {
        return Z.valueOf(r);
      }
      t = t.multiply(mLim).add(mN);
      ++r;
      if (mVerbose && r % 100 == 0) {
        StringUtils.message(mN + " search completed to " + r);
      }
    }
  }
}
