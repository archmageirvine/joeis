package irvine.oeis.a063;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063167 Composite numbers which in base 8 contain their largest proper factor as a substring.
 * @author Sean A. Irvine
 */
public class A063167 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 891;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!mPrime.isPrime(mN) && Long.toString(mN, 8).contains(Long.toString(mN / LeastPrimeFactorizer.lpf(Z.valueOf(mN)).longValue(), 8))) {
        return Z.valueOf(mN);
      }
    }
  }
}
