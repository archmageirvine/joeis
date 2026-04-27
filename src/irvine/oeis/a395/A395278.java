package irvine.oeis.a395;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A395278 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A395278 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      for (long y = 5; y < mN; y = mPrime.nextPrime(y)) {
        final long u = y * mN;
        for (long x = 3; x < y; x = mPrime.nextPrime(x)) {
          for (long w = 2; w < x; w = mPrime.nextPrime(w)) {
            mCounts.increment(w * x + u);
          }
        }
      }
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
