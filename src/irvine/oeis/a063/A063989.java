package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063989 Numbers with a prime number of prime divisors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A063989 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(Functions.BIG_OMEGA.l(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
