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
  private final LongDynamicLongArray mNextPosition = new LongDynamicLongArray();
  private long mN = 0;
  private long mBest = 0;

  // Count the number of steps needed to solve circle starting with n points
  private long count(final long n) {
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
      position = mNextPosition.get(mNextPosition.get(mNextPosition.get(mNextPosition.get(position))));
      // Are we splitting two of the original points
      if (position < mN && mNextPosition.get(position) < mN) {
        --remaining;
      }
      // Insert a new node
      mNextPosition.set(free, mNextPosition.get(position));
      mNextPosition.set(position, free);
      ++free;
    }
    return free - n;
  }

  @Override
  public Z next() {
    // Sequence gives progressive records of positions needing a greater number of steps
    while (true) {
      final long count = count(++mN);
      if (count > mBest) {
        mBest = count;
        return Z.valueOf(mN);
      }
    }
  }
}
