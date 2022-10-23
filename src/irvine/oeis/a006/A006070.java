package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006070 Number of Hamiltonian paths on n-cube which are strictly not cycles.
 * @author Sean A. Irvine
 */
public class A006070 extends Sequence1 {

  private int mN = 0;
  private long mCount = 0;
  private boolean[] mUsed = null;
  private int[][] mAdjacencies; // used to store precomputed adjacency

  private void search(final int used, final int pos) {
    if (used == mUsed.length) {
      if (Integer.bitCount(pos) != 1) { // ^ 0
        ++mCount;
      }
      return;
    }
    final int[] p = mAdjacencies[pos];
    for (final int k : p) {
      if (!mUsed[k]) {
        // We can get to this node in one step from current node
        mUsed[k] = true;
        search(used + 1, k);
        mUsed[k] = false;
      }
    }
  }

  private void computeAdjacencies(final int m) {
    final int v = 1 << m;
    mAdjacencies = new int[v][m];
    for (int n = 0; n < v; n++) {
      for (int k = 0, j = 0; k < v; k++) {
        if (Integer.bitCount(n ^ k) == 1) {
          mAdjacencies[n][j++] = k;
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    computeAdjacencies(mN);
    mUsed = new boolean[1 << mN];
    mUsed[0] = true; // assume we use edge (0,1) first
    mUsed[1] = true;
    mCount = 0;
    search(2, 1);
    return Z.valueOf(mCount).multiply(mN).shiftLeft(mN);
  }
}

