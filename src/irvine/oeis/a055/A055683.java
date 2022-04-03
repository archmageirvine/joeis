package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055683 Number of Gaussian primes (in the first half quadrant; i.e., 0 to 45 degrees) with real part &lt;= 10^n.
 * @author Sean A. Irvine
 */
public class A055683 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mLim = 1;
  private long mN = 1;
  private long mCount = 0;

  @Override
  public Z next() {
    mLim *= 10;
    while (mN < mLim) {
      if ((mN & 3) == 3 && mPrime.isPrime(mN)) {
        ++mCount;
      }
      final long n2 = mN * mN;
      for (long m = 1; m <= mN; ++m) {
        if (mPrime.isPrime(n2 + m * m)) {
          ++mCount;
        }
      }
      ++mN;
    }
    return Z.valueOf(mCount);
  }
}
