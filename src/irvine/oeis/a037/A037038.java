package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037038 Number of primes between n and 4n+1.
 * @author Sean A. Irvine
 */
public class A037038 extends Sequence1 {

  private final Prime mPrime = new Fast();
  private long mPi = 0;
  private long mN = 0;

  @Override
  public Z next() {
    if (mPrime.isPrime(mN++)) {
      --mPi;
    }
    if (mPrime.isPrime(4 * mN + 1)) {
      ++mPi;
    }
    if (mPrime.isPrime(4 * mN)) {
      ++mPi;
    }
    if (mPrime.isPrime(4 * mN - 1)) {
      ++mPi;
    }
    if (mPrime.isPrime(4 * mN - 2)) {
      ++mPi;
    }
    return Z.valueOf(mPi);
  }
}
