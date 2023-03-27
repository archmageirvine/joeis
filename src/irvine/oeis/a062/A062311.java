package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062311 Number of ways writing n! as a sum of two primes.
 * @author Sean A. Irvine
 */
public class A062311 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mF = 1;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 20) {
      throw new UnsupportedOperationException();
    }
    if (mN > 1) {
      mF *= mN;
    }
    long cnt = 0;
    for (long p = 2; 2 * p <= mF; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(mF - p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

