package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063080 Numbers k such that k/d(k) is prime, where d(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A063080 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      final long d = Jaguar.factor(++mN).sigma0AsLong();
      if (mN % d == 0 && mPrime.isPrime(mN / d)) {
        return Z.valueOf(mN);
      }
    }
  }
}
