package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A084393 Rearrangement of natural numbers such that the n-th term is coprime to n and the sum of n terms starting from the n-th term is a multiple of n.
 * @author Sean A. Irvine
 */
public class A084393 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mLeastUnused = 2;
  private long mN = 0;
  protected final LongDynamicLongArray mSums = new LongDynamicLongArray();

  @Override
  public Z next() {
    if (++mN == 1) {
      mSums.set(1, 1);
      return Z.ONE;
    }
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    while (true) {
      if (!mUsed.isSet(k)) {
        if (Functions.GCD.l(k, mN) == 1) {
          final long m = (mN + 1) / 2;
          if ((mN & 1) == 0 || (mSums.get(m) + k) % m == 0) {
            for (long j = m; j <= mN; ++j) {
              mSums.add(j, k);
            }
            mUsed.set(k);
            return Z.valueOf(k);
          }
        }
      }
      ++k;
    }
  }
}
