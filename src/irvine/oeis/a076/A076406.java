package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076406 Numbers whose digital sum is equal to the sum of primes from their smallest to largest prime factor.
 * @author Sean A. Irvine
 */
public class A076406 extends Sequence1 {

  private final Fast mPrime = new Fast();

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      Z sum = Z.ZERO;
      for (long p = Functions.LPF.l(++mN); p <= Functions.GPF.l(mN); p = mPrime.nextPrime(p)) {
        sum = sum.add(p);
      }
      if (sum.equals(Functions.DIGIT_SUM.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
