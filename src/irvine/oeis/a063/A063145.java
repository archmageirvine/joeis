package irvine.oeis.a063;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063145 Composite numbers not divisible by 2 which in base 4 contain their largest proper factor as a substring.
 * @author Sean A. Irvine
 */
public class A063145 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 403;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!mPrime.isPrime(mN) && Long.toString(mN, 4).contains(Long.toString(mN / LeastPrimeFactorizer.lpf(Z.valueOf(mN)).longValue(), 4))) {
        return Z.valueOf(mN);
      }
    }
  }
}
