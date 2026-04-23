package irvine.oeis.a395;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A395255 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A395255 extends Sequence0 {

  // todo definition wrong?

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mPrime.isPrime(mN)) {
      for (long y = 2; y <= mN; y = mPrime.nextPrime(y)) {
        for (long x = 2; x <= mN; x = mPrime.nextPrime(x)) {
          mCounts.add(x * x + y * mN, y == mN ? 1 : 2);
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
