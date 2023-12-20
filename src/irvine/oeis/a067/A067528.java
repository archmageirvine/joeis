package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A067528 Numbers n such that n - 4^k is a prime or 1 for all k &gt; 0 and n &gt; 4^k.
 * @author Sean A. Irvine
 */
public class A067528 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private long mN = 4;

  private boolean is(final long n) {
    for (long k = 4; k < n; k <<= 2) {
      if (n - k != 1 && !mPrime.isPrime(n - k)) {
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
