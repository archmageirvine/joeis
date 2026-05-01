package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395446 Number of Hamiltonian paths on an n X n grid, starting from a fixed corner cell and ending anywhere, where the allowed moves are (+-3,0), (0,+-3), or (+-2,+-2).
 * @author Sean A. Irvine
 */
public class A395446 extends Sequence1 {

  // Only good for a few terms

  private static final int[] DX = {0, 3, 0, -3, 2, 2, -2, -2};
  private static final int[] DY = {3, 0, -3, 0, 2, -2, 2, -2};
  private int mN = 0;
  private long mCount = 0;
  boolean[] mUsed;

  private void search(final int x, final int y, final int remaining) {
    if (remaining == 0) {
      ++mCount;
      return;
    }
    for (int k = 0; k < DX.length; ++k) {
      final int nx = x + DX[k];
      if (nx >= 0 && nx < mN) {
        final int ny = y + DY[k];
        if (ny >= 0 && ny < mN) {
          final int pack = mN * ny + nx;
          if (!mUsed[pack]) {
            mUsed[pack] = true;
            search(nx, ny, remaining - 1);
            mUsed[pack] = false;
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN <= 4) {
      return mN == 1 ? Z.ONE : Z.ZERO;
    }
    mCount = 0;
    mUsed = new boolean[mN * mN];
    mUsed[0] = true;
    mUsed[3] = true;
    search(3, 0, mN * mN  - 2);
    mUsed[3] = false;
    mCount *= 2; // symmetry on first step
    mUsed[2 * mN + 2] = true;
    search(2, 2, mN * mN - 2);
    //mUsed[2 * mN + 2] = false;
    return Z.valueOf(mCount);
  }
}
