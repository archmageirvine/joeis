package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A085452 Triangle T(n,k) read by rows: T(n,k) = number of cycles of length 2k in the binary n-cube, for n &gt;= 2, k = 2, 3, ..., 2^(n-1).
 * @author Sean A. Irvine
 */
public class A085452 extends Sequence2 {

  // Cf. A085408

  // Only good for a few terms

  private int mN = 1;
  private int mM = 0;
  private int mStart;
  private int mSecond;
  private long[] mCounts = {};
  private long mVisited;

  private void dfs(final int v, final int depth) {
    for (int k = 0; k < mN; ++k) {
      final int u = v ^ (1 << k);

      // close cycle
      if (u == mStart) {
        if (depth >= 4 && (depth & 1) == 0) {
          if (mSecond < v) {
            ++mCounts[depth / 2];
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
    if (++mM >= mCounts.length || mCounts[mM] == 0) {
      if (++mN <= 1) {
        return Z.ZERO;
      }
      final int vertices = 1 << mN;
      mCounts = new long[1 << (mN - 1) + 1];
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
      mM = 2;
    }
    return Z.valueOf(mCounts[mM]);
  }
}
