package irvine.oeis.a384;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384424 allocated for Yifan Xie.
 * @author Sean A. Irvine
 */
public class A384424 extends Sequence1 {

  private Graph mGraph = null;
  private int mN = 0;
  private int mBad = 0;
  private boolean[] mUsed = null;

  private long dist(final int px, final int py) {
    // To avoid 1/2, scale up coordinates by 2
    final long dx = 2L * px - (mN - 1);
    final long dy = 2L * py - (mN - 1);
    return dx * dx + dy * dy;
  }

  private void search(final int point, final int remaining, final int badCount) {
    if (remaining == 0) {
      mBad = badCount;
      System.out.println(mN + " New minimum bad steps: " + mBad + " final point " + point);
      return;
    }
    // Try expanding path from current point
    final long dp = dist(point % mN, point / mN);
    for (int q = mGraph.nextVertex(point, -1); q >= 0; q = mGraph.nextVertex(point, q)) {
      if (!mUsed[q] || (remaining == 1 && q == 0)) {
        final int qx = q % mN;
        final int qy = q / mN;
        final long dq = dist(qx, qy);
        final int newBadCount = dq >= dp ? badCount + 1 : badCount;
        if (newBadCount < mBad) {
          mUsed[q] = true;
          search(q, remaining - 1, newBadCount);
          mUsed[q] = false;
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mGraph = GraphFactory.kings(mN);
    mBad = mN * mN;
    mUsed = new boolean[mN * mN];
    mUsed[0] = true;
    search(0, mN * mN, 0);
    return Z.valueOf(mN * mN - mBad);
  }
}

