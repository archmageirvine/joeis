package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A064936 Primes p such that gcd(p, prime(p)^2 - 1) does not equal 1.
 * @author Sean A. Irvine
 */
public class A064936 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mQ = 1;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      while (mM < mP) {
        ++mM;
        mQ = mPrime.nextPrime(mQ);
        if (mVerbose && mM % 10000000 == 0) {
          StringUtils.message("Search completed to " + mM);
        }
      }
      final Z p = Z.valueOf(mP);
      if (!Z.valueOf(mQ).square().subtract(1).gcd(p).equals(Z.ONE)) {
        return p;
      }
    }
  }
}
