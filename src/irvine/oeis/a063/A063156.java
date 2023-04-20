package irvine.oeis.a063;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063145.
 * @author Sean A. Irvine
 */
public class A063156 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!mPrime.isPrime(mN) && Long.toString(mN, 6).contains(Long.toString(mN / LeastPrimeFactorizer.lpf(Z.valueOf(mN)).longValue(), 6))) {
        return Z.valueOf(mN);
      }
    }
  }
}
