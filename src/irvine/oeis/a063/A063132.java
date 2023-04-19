package irvine.oeis.a063;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063132 Composite numbers not divisible by 2 or 3 which in base 3 contain their largest proper factor as a substring.
 * @author Sean A. Irvine
 */
public class A063132 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mAdd = 4;
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      mAdd = 6 - mAdd;
      mN += mAdd;
      if (!mPrime.isPrime(mN) && Long.toString(mN, 3).contains(Long.toString(mN / LeastPrimeFactorizer.lpf(Z.valueOf(mN)).longValue(), 3))) {
        return Z.valueOf(mN);
      }
    }
  }
}
