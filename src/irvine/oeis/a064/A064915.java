package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A064915 Positive integers n that are not of the form p + q * a^2, where p and q are primes and a is the smallest prime not dividing n.
 * @author Sean A. Irvine
 */
public class A064915 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    outer:
    while (true) {
      ++mN;
      long a = 2;
      while (mN % a == 0) {
        a = mPrime.nextPrime(a);
      }
      final long aa = a * a;
      for (long q = 2, r; (r = mN - q * aa) > 0; q = mPrime.nextPrime(q)) {
        if (mPrime.isPrime(r)) {
          if (mVerbose && mN % 10000000 == 0) {
            StringUtils.message("Search completed to " + mN);
          }
          continue outer;
        }
      }
      return Z.valueOf(mN);
    }
  }
}

