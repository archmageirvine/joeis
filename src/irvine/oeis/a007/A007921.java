package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007921 Numbers that are not the difference of two primes.
 * @author Sean A. Irvine
 */
public class A007921 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!mPrime.isPrime(mN + 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
