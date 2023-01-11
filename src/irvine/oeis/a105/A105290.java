package irvine.oeis.a105;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A105290 Numbers k such that prime(k+1) == 4 (mod k).
 * @author Sean A. Irvine
 */
public class A105290 extends Sequence1 {

  private long mN = 0;
  private long mSP = 7;
  private final Fast mPrime = new Fast();
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    // All solutions must have odd n
    if (mN == 0) {
      mN = 1;
      return Z.ONE;
    } else if (mN == 1) {
      mN = 3;
      return Z.THREE;
    }
    while (mSP < 341550071728321L) {
      mSP = mPrime.nextPrime(mPrime.nextPrime(mSP));
      mN += 2;
      if (mSP % mN == 4) {
        return Z.valueOf(mN);
      }
      if (mVerbose && (mN - 1) % 10000000 == 0) {
        System.out.println("[" + mN + "]");
      }
    }
    // Exhausted smaller primes use full scale testing
    Z p = Z.valueOf(mSP);
    while (true) {
      p = mPrime.nextPrime(mPrime.nextPrime(p));
      mN += 2;
      if (p.mod(mN) == 4) {
        return Z.valueOf(mN);
      }
      if (mVerbose && (mN - 1) % 10000000 == 0) {
        System.out.println("[" + mN + "]");
      }
    }
  }
}

