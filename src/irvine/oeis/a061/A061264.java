package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061264 Number of cyclic permutations of the digits of n which give primes.
 * @author Sean A. Irvine
 */
public class A061264 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mMul = 1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mN == mMul) {
      mMul *= 10;
      ++mM;
    }
    long cnt = 0;
    long t = mN;
    for (int k = 0; k < mM; ++k) {
      if (mPrime.isPrime(t)) {
        ++cnt;
      }
      t = (t + (t % 10) * mMul) / 10;
    }
    return Z.valueOf(cnt);
  }
}
