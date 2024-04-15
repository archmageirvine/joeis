package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067531 Numbers n such that n - number of divisors of n is a prime.
 * @author Sean A. Irvine
 */
public class A067531 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(++mN - Functions.SIGMA0.l(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
