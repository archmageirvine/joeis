package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A002960 The square sieve.
 * @author Sean A. Irvine
 */
public class A002960 implements Sequence {

  // Start with
  //    1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,...
  // Remove all square-th elements, 1,4,9,16,... to get
  //    2,3,5,6,7,8,10,11,12,13,14,15,17,18,19,20,21,22,23,...
  // Return 2 is the first element in the sequence and remove it
  //    3,5,6,7,8,10,11,12,13,14,15,17,18,19,20,21,22,23,...
  // Remove the 1,4,9,16th,... elements
  //    5,6,8,10,11,12,14,15,17,18,19,20,22,23,...
  // Return 5 as the next element in the sequence and remove it
  //    6,8,10,11,12,14,15,17,18,19,20,22,23,...
  // Remove the 1,4,9,16th,... elements
  //    8,10,12,14,15,17,19,20,22,23,...
  // Return 8 as the next element in the sequence and remove it
  //    10,12,14,15,17,19,20,22,23,...
  // Remove the 1,4,9,16th,... elements
  //    12,14,15,19,20,22,23,...
  // etc.

  private final LongDynamicBooleanArray mSieve = new LongDynamicBooleanArray();
  private final DynamicLongArray mPositionByIteration = new DynamicLongArray();
  private final DynamicLongArray mLastUsedByIteration = new DynamicLongArray();
  private int mIteration = -1;
  private long mPos = 0;

  private void sieve(final int level) {
    final long n = mLastUsedByIteration.get(level) + 1;
    long s = 2 * n - 1; // n^2-(n-1)^2
    long pos = mPositionByIteration.get(level);
    while (s > 0) {
      ++pos;
      if (level > 0) {
        while (mPositionByIteration.get(level - 1) <= pos) {
          sieve(level - 1);
        }
      }
      if (!mSieve.isSet(pos)) {
        --s;
      }
    }
    mSieve.set(pos);
    mPositionByIteration.set(level, pos);
    mLastUsedByIteration.set(level, n);
  }

  @Override
  public Z next() {
    ++mIteration;
    while (true) {
      mPos = mSieve.nextClearBit(mPos);
      //System.out.println("Considering " + mPos);
      while (mPositionByIteration.get(mIteration) <= mPos) {
        sieve(mIteration);
      }
      if (!mSieve.isSet(mPos)) {
        mSieve.set(mPos);
        return Z.valueOf(mPos);
      }
    }
  }
}
