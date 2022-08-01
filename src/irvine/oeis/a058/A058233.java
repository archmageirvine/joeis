package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A058233 Primes p such that p#+1 is divisible by the next prime after p.
 * @author Sean A. Irvine
 */
public class A058233 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long q = mP;
      mP = mPrime.nextPrime(mP);
      if (mVerbose && ++mN % 10000 == 0) {
        StringUtils.message("Trying " + q + "#");
      }
      long primorial = 1;
      for (long p = 2; p <= q; p = mPrime.nextPrime(p)) {
        primorial *= p;
        primorial %= mP;
      }
      if (primorial == mP - 1) {
        return Z.valueOf(q);
      }
    }
  }
}
