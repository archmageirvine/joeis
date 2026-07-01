package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395110 allocated for Giedrius Alkauskas.
 * @author Sean A. Irvine
 */
public class A395110 extends Sequence1 {

  private int mN = 2;
  private long mCount = 0;

//  private boolean completeCheck(final int[][] f) {
//    for (int y = 1; y < f.length - 1; ++y) {
//      for (int x = 1; x < f.length - 1; ++x) {
//        if ((f[y - 1][x] + f[y + 1][x] + f[y][x - 1] + f[y][x + 1] + 3) / 4 != f[y][x]) {
//          return false;
//        }
//      }
//    }
//    return true;
//  }

  private boolean isOk(final int[][] f, final int x, final int y) {
    if (y == 0) {
      return true;
    }
    return (f[y - 1][x] + f[y + 1][x] + f[y][x - 1] + f[y][x + 1] + 3) / 4 == f[y][x];
  }

  private boolean isOkPartial(final int[][] f, final int x, final int y) {
    return (f[y - 1][x] + f[y][x - 1] + 3) / 4 <= f[y][x];
  }

  private void search(final int[][] f, final int x, final int y) {
    if (y >= mN - 1) {
      if (isOk(f, mN - 2, mN - 2)) {
        ++mCount;
      }
    } else if (x >= mN - 1) {
      search(f, 1, y + 1);
    } else {
      for (int k = 0; k < mN; ++k) {
        f[y][x] = k;
        if (isOkPartial(f, x, y) && isOk(f, x, y - 1) && (y < mN - 2 || x == 1 || isOk(f, x - 1, y))) {
          search(f, x + 1, y);
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    search(new int[mN][mN], 1, 1);
    return Z.valueOf(mCount);
  }
}
