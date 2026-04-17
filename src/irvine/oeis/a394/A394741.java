package irvine.oeis.a394;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A394741 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A394741 extends Sequence0 {

  // todo currently mismatches?

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mPrime.isPrime(mN)) {
      for (long y = 2; y <= mN; y = mPrime.nextPrime(y)) {
        for (long x = 2; x <= y; x = mPrime.nextPrime(x)) {
          mCounts.increment(x * x + y * mN);
        }
      }
      for (long z = 2; z < mN; z = mPrime.nextPrime(z)) {
        for (long x = 2; x <= mN; x = mPrime.nextPrime(x)) {
          mCounts.increment(x * x + mN * z);
        }
      }
      for (long y = 2; y < mN; y = mPrime.nextPrime(y)) {
        for (long z = 2; z < mN; z = mPrime.nextPrime(z)) {
          mCounts.increment(mN * mN + y * z);
        }
      }
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
