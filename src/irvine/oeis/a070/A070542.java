package irvine.oeis.a070;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A070542 Numbers n such that binomial(2n,n) does not have two prime factors that add to 2n.
 * @author Sean A. Irvine
 */
public class A070542 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private Z mB = Z.ONE;
  private long mN = 0;

  private boolean is(final Z b, final long n) {
    final long n2 = 2 * n;
    for (long p = 3; p < n; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(n2 - p) && b.mod(p) == 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mB = mB.multiply(4 * ++mN - 2).divide(mN);
      if (is(mB, mN)) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 100000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}
