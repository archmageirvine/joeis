package irvine.oeis.a086;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086976 Number of monotonic matrices of order n.
 * @author Sean A. Irvine
 */
public class A086976 extends Sequence1 {

  private int mN = 0;
  private long mCount = 0;
  private int[] mRow;
  private int[] mCol;
  private int[] mLeftmost;

  private void search(final int x, final int y) {
    if (y >= mN) {
      ++mCount;
      return;
    }
    if (x >= mN) {
      search(0, y + 1);
      return;
    }
    // 0 is always allowed
    search(x + 1, y);
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
        search(x + 1, y);
        mCol[x] = c;
        mRow[y] = r;
        mLeftmost[v] = l;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    mRow = new int[mN];
    mCol = new int[mN];
    mLeftmost = new int[mN + 1]; // leftmost x value for each n
    Arrays.fill(mCol, Integer.MAX_VALUE);
    Arrays.fill(mLeftmost, Integer.MAX_VALUE);
    search(0, 0);
    return Z.valueOf(mCount);
  }
}
