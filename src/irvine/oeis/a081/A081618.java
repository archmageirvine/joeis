package irvine.oeis.a081;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A081618 Numbers n such that (product of first n primes)+1 is divisible by the (n+1)-th prime. Also n such that A075306(n)-1 is equal to A002110(n). Positions of 1 in A081617.
 * @author Sean A. Irvine
 */
public class A081618 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      long p = 1;
      long prod = 1;
      for (long j = 0; j < mN; ++j) {
        p = mPrime.nextPrime(p);
        prod *= p;
        prod %= mP;
      }
      if (prod == mP - 1) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 100000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}
