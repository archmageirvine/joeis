package irvine.oeis.a063;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063172 Composite numbers which in base 9 contain their largest proper factor as a substring.
 * @author Sean A. Irvine
 */
public class A063172 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1385;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!mPrime.isPrime(mN) && Long.toString(mN, 9).contains(Long.toString(mN / LeastPrimeFactorizer.lpf(Z.valueOf(mN)).longValue(), 9))) {
        return Z.valueOf(mN);
      }
    }
  }
}
