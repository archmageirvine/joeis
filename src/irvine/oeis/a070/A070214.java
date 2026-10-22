package irvine.oeis.a070;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070214 Maximal number of occupied cells in monotonic matrix of order n.
 * @author Sean A. Irvine
 */
public class A070214 extends Sequence1 {

  private int mN = 0;
  private long mMax = 0;
  private int[] mRow;
  private int[] mCol;
  private int[] mLeftmost;

  private void search(final int x, final int y, final int nonzero, final int remaining) {
    if (y >= mN) {
      if (nonzero > mMax) {
        mMax = nonzero;
      }
      return;
    }
    if (nonzero + remaining <= mMax) {
      return;
    }
    if (x >= mN) {
      search(0, y + 1, nonzero, remaining);
      return;
    }
    // 0 is always allowed
    search(x + 1, y, nonzero, remaining - 1);
    // Row must increase
    for (int v = mRow[y] + 1; v <= mN; ++v) {
      // Col must decrease and check slope condition
      if (mCol[x] > v && mLeftmost[v] > x) {
        final int l = mLeftmost[v];
        final int r = mRow[y];
        final int c = mCol[x];
        mRow[y] = v;
        mCol[x] = v;
        mLeftmost[v] = Math.min(x, l);
        search(x + 1, y, nonzero + 1, remaining - 1);
        mCol[x] = c;
        mRow[y] = r;
        mLeftmost[v] = l;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mMax = 0;
    mRow = new int[mN];
    mCol = new int[mN];
    mLeftmost = new int[mN + 1]; // leftmost x value for each n
    Arrays.fill(mCol, Integer.MAX_VALUE);
    Arrays.fill(mLeftmost, Integer.MAX_VALUE);
    search(0, 0, 0, mN * mN);
    return Z.valueOf(mMax);
  }
}
