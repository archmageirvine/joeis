package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A065134 Remainder when n is divided by the number of primes not exceeding n.
 * @author Sean A. Irvine
 */
public class A065134 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private long mPi = 0;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      ++mPi;
    }
    return Z.valueOf(mN % mPi);
  }
}

