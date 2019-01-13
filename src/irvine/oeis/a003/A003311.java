package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

import java.util.ArrayList;

/**
 * A003311.
 * @author Sean A. Irvine
 */
public class A003311 implements Sequence {

  // This implementation does a kind of complicated incremental sieve.

  protected final LongDynamicBooleanArray mSieve = new LongDynamicBooleanArray();
  private final ArrayList<Long> mLudic = new ArrayList<>();
  private final ArrayList<Long> mLastCrossed = new ArrayList<>();
  private long mN = 2;

  private void update(final long n) {
    final int luds = mLastCrossed.size();
    if (luds == 0) {
      return; // Don't have any entries yet
    }
    while (mLastCrossed.get(luds - 1) < n) {
      // We need to advance the sieving
      for (int k = 0; k < luds; ++k) {
        final long ludicPrime = mLudic.get(k);
        final long limit = k == 0 ? Long.MAX_VALUE : mLastCrossed.get(k - 1);
        long last = mLastCrossed.get(k);
        for (long j = 0; j < ludicPrime && last < limit; ++j) {
          last = mSieve.nextClearBit(last);
        }
        if (last >= limit) {
          break; // Need to advance a lower number first
        }
        mSieve.set(last);
        mLastCrossed.set(k, last);
      }
    }
  }

  @Override
  public Z next() {
    do {
      mN = mSieve.nextClearBit(mN);
      update(mN);
    } while (mSieve.isSet(mN));
    if (mN > 1) {
      mLudic.add(mN);
      final long bit = mSieve.nextClearBit(mN);
      mSieve.set(bit);
      mLastCrossed.add(bit);
    }
    return Z.valueOf(mN);
  }

}
