package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018803 Number of ways to color cells of <code>an n</code> X n square with 2 colors so that no subsquare of side <code>&gt; 1</code> has all corners same color.
 * @author Sean A. Irvine
 */
public class A018803 implements Sequence {

  // This sequence is known to be finite, in fact n=15 onwards has no solution.
  // While could just implement FiniteSequence here, this code is an honest attempt to
  // compute the sequence.

  private int mN = -1;
  private long mCount = 0;
  private byte[][] mGrid = null;
  private int[][] mFillingOrder = null;

  private boolean isOk(final int x, final int y) {
    for (int t = Math.min(x, y); t > 0; --t) {
      final int cnt = mGrid[x][y] + mGrid[x - t][y] + mGrid[x][y - t] + mGrid[x - t][y - t];
      if (cnt == 0 || cnt == 4) {
        return false;
      }
    }
    return true;
  }

  private void search(final int t) {
    if (t == mFillingOrder.length) {
      //System.out.println(Arrays.deepToString(mGrid));
      ++mCount;
      return;
    }
    // Try making (x,y) false
    final int x = mFillingOrder[t][0];
    final int y = mFillingOrder[t][1];
    if (isOk(x, y)) {
      search(t + 1);
    }
    // Try making (x,y) true
    mGrid[x][y] = 1;
    if (isOk(x, y)) {
      search(t + 1);
    }
    mGrid[x][y] = 0;
  }

  @Override
  public Z next() {
    if (mN == 14) {
      return null; // There is no solution for 15x15 onwards
    }
    if (++mN == 0) {
      return Z.ONE;
    }
    mCount = 0;
    mGrid = new byte[mN][mN];

    // Work out the filling order, so that (x,y) < (x0, y0) always filled first
    mFillingOrder = new int[mN * mN][2];
    for (int shell = 0, k = 0; shell < mN; ++shell) {
      for (int t = 0; t < shell; ++t) {
        mFillingOrder[k][0] = shell;
        mFillingOrder[k][1] = t;
        ++k;
        mFillingOrder[k][0] = t;
        mFillingOrder[k][1] = shell;
        ++k;
      }
      mFillingOrder[k][0] = shell;
      mFillingOrder[k][1] = shell;
      ++k;
    }

    search(1); // cell (0,0) is always false (symmetry gives factor of 2)
    return Z.valueOf(mCount * 2);
  }

}
