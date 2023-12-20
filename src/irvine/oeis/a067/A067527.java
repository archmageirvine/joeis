package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A067527 n - 3^k is a prime for all k &gt; 0 such that 3^k &lt; n.
 * @author Sean A. Irvine
 */
public class A067527 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private long mN = 4;

  private boolean is(final long n) {
    for (long k = 3; k < n; k *= 3) {
      if (!mPrime.isPrime(n - k)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 100000000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}
