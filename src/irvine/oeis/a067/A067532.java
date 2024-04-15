package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067532 Numbers n such that n + number of divisors is a prime.
 * @author Sean A. Irvine
 */
public class A067532 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(++mN + Functions.SIGMA0.l(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
