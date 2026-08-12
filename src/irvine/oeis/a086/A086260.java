package irvine.oeis.a086;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A086260 Number of symmetric n X n conference matrices.
 * @author Sean A. Irvine
 */
public class A086260 extends Sequence1 {

  private final Bumper mBumper = BumperFactory.range(-1, 1);
  private long mCount = 0;
  private int mN = 0;

  private void search(final int[][] m, final int row) {
    if (row >= mN) {
      //System.out.println(Arrays.deepToString(m));
      ++mCount;
      return;
    }
    final int[] a = new int[mN - row - 1]; // remaining elements on the row
    Arrays.fill(a, -1);
    outer:
    do {
      System.arraycopy(a, 0, m[row], row + 1, a.length);
      for (int k = 0; k < a.length; ++k) {
        m[row + k + 1][row] = a[k];
      }
      // Check conference property of diagonal
      int sum = 0;
      for (int k = 0; k < mN; ++k) {
        sum += m[row][k] * m[row][k];
      }
      if (sum != mN - 1) {
        continue;
      }
      // Check conference property of other cells
      for (int j = 0; j < row; ++j) {
        int sj = 0;
        for (int k = 0; k < mN; ++k) {
          sj += m[j][k] * m[row][k];
        }
        if (sj != 0) {
          continue outer;
        }
      }
      search(m, row + 1);
    } while (mBumper.bump(a));
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    mCount = 0;
    final int[][] m = new int[mN][mN];
    for (int k = 1; k < mN; ++k) {
      m[0][k] = 1;
      m[k][0] = 1;
    }
    search(m, 1);
    return Z.valueOf(mCount).shiftLeft(mN - 1);
  }
}

