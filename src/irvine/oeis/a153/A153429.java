package irvine.oeis.a153;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A153429 Numbers k such that k! is equal to the sum of two consecutive primes.
 * @author Sean A. Irvine
 */
public class A153429 extends Sequence1 {

  private long mN = 3;
  private Z mF = Z.SIX;
  private final Fast mPrime = new Fast();
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      if (mVerbose && mN % 100 == 0) {
        System.out.println("[" + mN + "]");
      }
      final Z pp = mPrime.prevPrime(mF.divide2());
      final Z np = mF.subtract(pp);
      if (np.isProbablePrime() && mPrime.nextPrime(pp).equals(np)) {
        return Z.valueOf(mN);
      }
    }
  }
}

