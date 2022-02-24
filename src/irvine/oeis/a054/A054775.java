package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054775 Positive multiples of 6 which are not the midpoint of a pair of twin primes.
 * @author Sean A. Irvine
 */
public class A054775 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 18;

  @Override
  public Z next() {
    while (true) {
      mN += 6;
      if (mPrime.nextPrime(mN) - mPrime.prevPrime(mN) != 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
