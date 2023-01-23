package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A061155.
 * @author Sean A. Irvine
 */
public class A061157 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 10;
  protected long mP;

  private boolean is(final long n) {
    int primeCnt = 0;
    Z t = Z.valueOf(n);
    for (long k = 0; k <= mN; ++k) {
      if (t.subtract(1).isProbablePrime()) {
        mP = k; // remember the prime (needed for A061156)
        if (++primeCnt > 1) {
          return false;
        }
      }
      t = t.multiply2();
    }
    return primeCnt == 1;
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      if (mVerbose && mN % 1000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
    if (mVerbose) {
      StringUtils.message("Found solution " + mN + " with exponent " + mP);
    }
    return Z.valueOf(mN);
  }
}
