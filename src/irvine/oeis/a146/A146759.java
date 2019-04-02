package irvine.oeis.a146;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A146759 Number of primes p &lt; 10^n such that c - p is prime, where c is the next cube greater than p.
 * @author Sean A. Irvine
 */
public class A146759 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private long mCount = 0;
  private long mCubeBase = 2;
  private long mCube = 8;

  @Override
  public Z next() {
    long p = mN - 1;
    mN *= 10L;
    while ((p = mPrime.nextPrime(p)) <= mN) {
      while (p > mCube) { // I think "if" would work here
        ++mCubeBase;
        mCube = mCubeBase * mCubeBase * mCubeBase;
      }
      if ((mCube & 1) == 1) {
        // For an odd cube, only possible prime is mCube - 2
        p = mCube - 2;
        if (p <= mN && mPrime.isPrime(p)) {
          ++mCount;
        }
      } else if (mPrime.isPrime(mCube - p)) {
        assert p <= mN;
        ++mCount;
      }
    }
    return Z.valueOf(mCount);
  }
}
