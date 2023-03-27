package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062310 Number of ways writing n! as a sum of two nonprime numbers.
 * @author Sean A. Irvine
 */
public class A062310 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mF = 1;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 20) {
      throw new UnsupportedOperationException();
    }
    mF *= mN;
    long cnt = 0;
    for (long k = 1; 2 * k <= mF; ++k) {
      if (!mPrime.isPrime(k) && !mPrime.isPrime(mF - k)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

