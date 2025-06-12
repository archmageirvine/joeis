package irvine.oeis.a384;

import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384424 allocated for Yifan Xie.
 * @author Sean A. Irvine
 */
public class A384424 extends Sequence1 {

  private Lattice mGrid = null;
  private int mN = 0;
  private int mBad = 0;
  private boolean[][] mUsed = null;

  private double dist(final long px, final long py) {
    final double dx = px - 0.5 * (mN - 1);
    final double dy = py - 0.5 * (mN - 1);
    return dx * dx + dy * dy;
  }

  private void search(final long point, final int remaining, final int badCount) {
    if (remaining == 0) {
      System.out.println(mN + " New minimum bad steps: " + mBad);
      mBad = badCount;
      return;
    }
    // Try expanding path from current point
    final double dp = dist(mGrid.ordinate(point, 0), mGrid.ordinate(point, 1));
    final int nc = mGrid.neighbourCount(point);
    for (int k = 0; k < nc; ++k) {
      final long q = mGrid.neighbour(point, k);
      final int qx = (int) mGrid.ordinate(q, 0);
      final int qy = (int) mGrid.ordinate(q, 1);
      if (!mUsed[qx][qy]) {
        final double dq = dist(qx, qy);
        if (mN == 3) {
          System.out.println(mGrid.toString(point) + " -> " + mGrid.toString(q) + " " + (dq >= dp) + " " + dp + " " + dq);
        }
        final int newBadCount = dq >= dp ? badCount + 1 : badCount;
        if (newBadCount < mBad) {
          mUsed[qx][qy] = true;
          search(q, remaining - 1, newBadCount);
          mUsed[qx][qy] = false;
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mGrid = Lattices.grid(mN, mN); // todo this is wrong we want 8 way stepping, we needs kings graph equivalent
    mBad = mN * mN;
    mUsed = new boolean[mN][mN];
    //mUsed[0] = true; // todo awaiting clarification if we are looking for a cycle
    search(mGrid.origin(), mN * mN, 0);
    return Z.valueOf(mN * mN - mBad);
  }
}

