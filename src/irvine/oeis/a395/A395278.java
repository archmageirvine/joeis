package irvine.oeis.a395;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A395278 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A395278 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = 5;

  /** Construct the sequence. */
  public A395278() {
    super(41);
  }

  @Override
  public Z next() {
    while (true) {
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
      if (mN >= 41) {
        return Z.valueOf(mCounts.get(mN));
      }
    }
  }
}
