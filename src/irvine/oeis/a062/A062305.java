package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062296.
 * @author Sean A. Irvine
 */
public class A062305 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN = mN == 0 ? 1 : mN << 1;
    long cnt = 0;
    for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
      if (!mPrime.isPrime(mN - p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

