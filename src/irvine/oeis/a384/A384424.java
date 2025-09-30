package irvine.oeis.a384;

import java.util.Arrays;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A384424 The maximal possible number of 'good' steps in a Hamiltonian cycle on the n X n king's graph, as is specified in the comments.
 * @author Sean A. Irvine
 */
public class A384424 extends Sequence1 {

  // This was used to verify a(6) but is too slow to go further

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private Graph mGraph = null;
  private int mN = 0;
  private int mBad = 0;
  private int[] mDist = null;
  private int[] mPath = null;
  private boolean[] mUsed = null;

  private int dist(final int px, final int py) {
    // To avoid 1/2, scale up coordinates by 2
    final int dx = 2 * px - (mN - 1);
    final int dy = 2 * py - (mN - 1);
    return dx * dx + dy * dy;
  }

  private void search(final int point, final int remaining, final int badCount) {
    final int dp = mDist[point];
    // Handle closing the loop
    if (remaining <= 1) {
      if (mGraph.isAdjacent(point, 0)) {
        // The point (0,0) is always a maximum distance from the middle, so moving to
        // this point at the end of the cycle is always "bad"
        if (badCount + 1 < mBad) {
          mBad = badCount + 1;
          if (mVerbose) {
            StringUtils.message(mN + " New minimum bad steps: " + mBad + " " + Arrays.toString(mPath));
          }
        }
      }
      return;
    }
    // Try expanding path from current point
    for (int q = mGraph.nextVertex(point, -1); q >= 0; q = mGraph.nextVertex(point, q)) {
      if (!mUsed[q]) {
        final int dq = mDist[q];
        final int newBadCount = dq >= dp ? badCount + 1 : badCount;
        if (newBadCount < mBad) {
          if (mVerbose) {
            mPath[mPath.length - remaining] = q;
          }
          mUsed[q] = true;
          search(q, remaining - 1, newBadCount);
          mUsed[q] = false;
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ZERO;
    }
    mGraph = GraphFactory.kings(mN);
    mBad = mN * mN;
    // Precompute (squared) distance to center for each point
    // Note these values are scaled up to avoid 1/2,
    // but we care only about relative distance.
    mDist = new int[mN * mN];
    for (int k = 0; k < mDist.length; ++k) {
      mDist[k] = dist(k % mN, k / mN);
    }
    mPath = new int[mN * mN];
    mUsed = new boolean[mN * mN];
    mUsed[0] = true;
    // WLOG assume first step is to either (1,0) or (1,1)
    mUsed[1] = true;
    mPath[0] = 1;
    search(1, mN * mN - 1, 0);
    mUsed[1] = false;
    mUsed[mN + 1] = true;
    mPath[0] = mN + 1;
    search(mN + 1, mN * mN - 1, 0);
    mUsed[mN + 1] = false;
    return Z.valueOf((long) mN * mN - mBad);
  }
}

