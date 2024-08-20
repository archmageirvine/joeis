package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A071864 Nonprime n such that the number of elements in the continued fraction for Sum_{d|n} 1/d equals tau(n), the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A071864 extends A071862 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Functions.SIGMA0.z(mN)) && !mPrime.isPrime(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
