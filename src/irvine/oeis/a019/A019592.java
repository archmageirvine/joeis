package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A019592.
 * @author Sean A. Irvine
 */
public class A019592 implements Sequence {

  // Each entry points to next node in the circle.  Those with index < mN are original points
  protected final LongDynamicLongArray mNextPosition = new LongDynamicLongArray();
  private long mN = 0;
  private long mBest = 0;

  protected long step(final long position) {
    return mNextPosition.get(mNextPosition.get(mNextPosition.get(mNextPosition.get(position))));
  }

  // Count the number of steps needed to solve circle starting with n points
  protected long count(final long n) {
    // Form initial circle of points
    for (long k = 0; k < n - 1; ++k) {
      mNextPosition.set(k, k + 1);
    }
    mNextPosition.set(n - 1, 0);
    long free = n;
    // Insert extra points
    long position = 0;
    long remaining = n;
    while (remaining > 0) {
      position = step(position);
      // Are we splitting two of the original points
      if (position < n && mNextPosition.get(position) < n) {
        --remaining;
      }
      // Insert a new node
      mNextPosition.set(free, mNextPosition.get(position));
      mNextPosition.set(position, free);
      ++free;
    }
    return free - n;
  }

  protected long select(final long n, final long best) {
    return n;
  }

  // The graph of the count function has a kind of saw-tooth shape.  Therefore,
  // we can search for the next maximum using a binary search, but we need to be
  // careful that intervening local maxima are not skipped over.

  @Override
  public Z next() {
    // Sequence gives progressive records of positions needing a greater number of steps
    if (mN < 1) {
      mN = 1;
      mBest = 1;
      return Z.valueOf(select(1, 1));
    }
    // Use a kind of binary search on (mN, mBest) : (t*mN, ?)
    long hi = mN;
    long hiCount;
    do {
      hi += mN;
      hiCount = count(hi);
    } while (hiCount <= mBest);
    while (true) {
      long lo = mN;
      while (lo <= hi) {
        final long m = (lo + hi) / 2;
        final long count = count(m);
        if (count < hiCount) {
          lo = m + 1;
        } else if (count > hiCount) {
          hi = m - 1;
          hiCount = count;
        } else {
          lo = m;
          break;
        }
      }
      if (count(lo - 1) <= mBest) {
        mBest = count(lo);
        mN = lo;
        return Z.valueOf(select(mN, mBest));
      }
      hi = lo - 1; // redo the search in smaller interval
      hiCount = count(hi);
    }
  }
}
