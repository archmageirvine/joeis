package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A061154 Numbers k such that k*2^m-1 are composites for all exponents m in the range 0&lt;=m&lt;=k.
 * @author Sean A. Irvine
 */
public class A061154 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 147;

  private boolean is(final long n) {
    Z t = Z.valueOf(n);
    for (long k = 0; k <= mN; ++k) {
      if (t.subtract(1).isProbablePrime()) {
        return false;
      }
      t = t.multiply2();
    }
    return true;
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      if (mVerbose && mN % 1000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
    return Z.valueOf(mN);
  }
}
