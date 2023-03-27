package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062306 Number of ways writing 2^n as a sum of two nonprime numbers.
 * @author Sean A. Irvine
 */
public class A062306 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    mN <<= 1;
    long cnt = 0;
    for (long k = 1; 2 * k <= mN; ++k) {
      if (!mPrime.isPrime(k) && !mPrime.isPrime(mN - k)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

