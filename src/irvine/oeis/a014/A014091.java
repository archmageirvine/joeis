package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014091 Numbers that are the sum of 2 primes.
 * @author Sean A. Irvine
 */
public class A014091 extends Sequence1 {

  // Assumes Goldbach conjecture

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if ((++mN & 1) == 0 || mPrime.isPrime(mN - 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
