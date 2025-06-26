package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A384704 Triangle T(i, j), 1 &lt;= j &lt;= i, read by rows. T(i, j) is the smallest number k that has i odd divisors and whose symmetric representation of sigma, SRS(k), has j parts; when no such k exists then T(i, j) = -1.
 * @author Sean A. Irvine
 */
public class A384704 extends Sequence1 {

  private LongDynamicLongArray mState;
  private int mN = 0;
  private long mCount = 0;

  // We reverse the role of 0 and 1 from the sequence description

  private void shuffle(final long w, final long shuffle, final long x, final long y) {
    if (x == 0 && y == 0) {
      final long current = mState.get(shuffle);
      if (current >= 0) {
        if (current == 0) {
          ++mCount;
          mState.set(shuffle, w); // first time we have seen "shuffle"
        } else if (current != w) {
          --mCount;
          mState.set(shuffle, -1); // "shuffle" is obtainable by more than one word
        }
      }
      return;
    }
    if (x != 0) {
      shuffle(w, (shuffle << 1) + (x & 1), x >>> 1, y);
    }
    if (y != 0) {
      shuffle(w, (shuffle << 1) + (y & 1), x, y >>> 1);
    }
  }

  @Override
  public Z next() {
    if (++mN > 31) {
      throw new UnsupportedOperationException();
    }
    mCount = 0;
    // Use mState to track shuffles we have seen, by storing the word "w" that has
    // generated it, or -1 if the shuffle has more than 1 source word "w".
    mState = new LongDynamicLongArray();
    for (long w = 1L << (mN - 1); w < 1L << mN; ++w) {
      shuffle(w, 0, w, w);
    }
    return Z.valueOf(mCount);
  }
}

