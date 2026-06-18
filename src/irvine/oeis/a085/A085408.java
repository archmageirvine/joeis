package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085408 Total number of cycles in the binary n-cube.
 * @author Sean A. Irvine
 */
public class A085408 extends Sequence1 {

  // Only good for a few terms

  private int mN = 0;
  private int mStart;
  private int mSecond;
  private long mCount;
  private long mVisited;

  private void dfs(final int v, final int depth) {
    for (int k = 0; k < mN; ++k) {
      final int u = v ^ (1 << k);

      // close cycle
      if (u == mStart) {
        if (depth >= 4 && (depth & 1) == 0) {
          if (mSecond < v) {
            ++mCount;
          }
        }
        continue;
      }

      if (u < mStart) {
        continue;
      }

      final long bit = 1L << u;
      if ((mVisited & bit) != 0) {
        continue;
      }

      mVisited |= bit;
      dfs(u, depth + 1);
      mVisited ^= bit;
    }
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ZERO;
    }
    final int vertices = 1 << mN;
    mCount = 0;
    for (mStart = 0; mStart < vertices; ++mStart) {
      mVisited = 1L << mStart;
      for (int k = 0; k < mN; ++k) {
        mSecond = mStart ^ (1 << k);
        if (mSecond < mStart) {
          continue;
        }
        mVisited |= 1L << mSecond;
        dfs(mSecond, 2);
        mVisited ^= 1L << mSecond;
      }
    }
    return Z.valueOf(mCount);
  }
}
