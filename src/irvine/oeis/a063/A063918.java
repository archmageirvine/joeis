package irvine.oeis.a063;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063917.
 * @author Sean A. Irvine
 */
public class A063918 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mPrime.isPrime(mN)) {
      return Z.ZERO;
    }
    return LeastPrimeFactorizer.lpf(Z.valueOf(mN));
  }
}
