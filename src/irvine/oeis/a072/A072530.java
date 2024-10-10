package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072530 Number of primes p such that n divided by p leaves a prime remainder.
 * @author Sean A. Irvine
 */
public class A072530 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(mN % p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
