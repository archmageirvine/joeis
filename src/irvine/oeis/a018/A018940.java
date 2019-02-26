package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018940.
 * @author Sean A. Irvine
 */
public class A018940 implements Sequence {

  // We are given the quotient graph, which you can think of as the repeating unit.
  // We then have to find cycles in the full graph.  This is done with a depth first
  // search.  To speed up the search, we also maintain the shortest distance of
  // each node from the origin.  That way, if it would be impossible to close the
  // cycle in the remaining steps, then the search can be abandoned.

  // We also need a way of describing the position with the lattice.  Can think
  // of this as a quadruple (a,b,c,d) where "a" is the node in the quotient graph
  // and b, c, d, track the specific instance of that node.  To make the
  // computation faster (a,b,c,d) is squeezed into an "int" with 2 bits for a,
  // and 7 bits each for b, c, d (in that order).  Finally, the origin is selected
  // to be in the middle of this representation, so that we do not need to worry
  // about negative numbers.  Taken together this means we can in theory generate
  // up to 64 terms of the sequence, but we would get sick of waiting long before
  // then.

  private static final int BITS_PER_COORD = 7;
  private static final int BITS_PER_NODE = 2;
  private static final int B = BITS_PER_NODE + 3 * BITS_PER_COORD;
  private static final int C = BITS_PER_NODE + 2 * BITS_PER_COORD;
  private static final int D = BITS_PER_NODE + BITS_PER_COORD;
  private static final int NODE_MASK = (1 << BITS_PER_NODE) - 1;
  private static final int ORIGIN = (1 << (B - 1)) + (1 << (C - 1)) + (1 << (D - 1));

  private int mN = 2;
  private long mCount = 0;

  /*  The neighbourhood table of ABW (from Topolan).
        periodicity 3
       No. of vertices: 4
       No. of edges: 8
       a-1:    a-4(000)    a-3(+0+)    a-3(000)    a-2(0+0)
       a-2:    a-4(+0+)    a-4(000)    a-3(0-+)
       a-3:    a-4(0+0)
   */

  // Quadruples giving change in node number and change in each coordinate for each neighbour
  private final int[][][] mQuotientGraph = {
    {{3, 0, 0, 0}, {2, 1, 0, 1}, {2, 0, 0, 0}, {1, 0, 1, 0}},
    {{2, 1, 0, 1}, {2, 0, 0, 0}, {1, 0, -1, 1}, {-1, 0, -1, 0}},
    {{1, 0, 1, 0}, {-1, 0, 1, -1}, {-2, 0, 0, 0}, {-2, -1, 0, -1}},
    {{-1, 0, -1, 0}, {-2, 0, 0, 0}, {-2, -1, 0, -1}, {-3, 0, 0, 0}},
  };

  // Convert to packed representation -- happens once during initialization
  private int[][] quotientToLongDeltas(final int[][][] graph) {
    final int vertices = graph.length;
    final int[][] delta = new int[vertices][];
    for (int v = 0; v < vertices; ++v) {
      final int neighbours = mQuotientGraph[v].length;
      delta[v] = new int[neighbours];
      for (int k = 0; k < neighbours; ++k) {
        final int[] s = mQuotientGraph[v][k];
        delta[v][k] = s[0] + (s[1] << C) + (s[2] << D) + (s[3] << BITS_PER_NODE);
      }
    }
    return delta;
  }

  private final int[][] mQuotientDelta = quotientToLongDeltas(mQuotientGraph);

  // Minimum distance from origin + 1 (uses 0 as sentinel)
  private final byte[] mDistance = new byte[2 * ORIGIN];
  private int mDistanceDone = 0;
  {
    mDistance[ORIGIN] = 1;
  }

  // Ensure the minimum distance cache goes out to distance n
  private void stepDistance(final int n) {
    while (mDistanceDone <= n) {
      ++mDistanceDone;
      final byte d = (byte) (mDistanceDone + 1);
      for (int k = 0; k < mDistance.length; ++k) {
        if (mDistance[k] == mDistanceDone) {
          for (final int delta : mQuotientDelta[k & NODE_MASK]) {
            final int j = k + delta;
            if (j >= 0 && j < mDistance.length && mDistance[j] == 0) {
              mDistance[j] = d;
            }
          }
        }
      }
    }
  }

  // Keep track of nodes on current path in depth first search
  private final boolean[] mVisited = new boolean[2 * ORIGIN];

  private void search(final int point, final int n) {
    if (n == mN) {
      if (point == ORIGIN) {
        ++mCount;
      }
      return;
    }
    if (point < 0 || point >= mDistance.length) {
      return;
    }

    final byte dist = mDistance[point];
    assert dist != 0;
    if (dist - 1 > mN - n) {
      return; // can never make it back to origin in time
    }

    if (!mVisited[point]) {
      mVisited[point] = true;
      for (final int delta : mQuotientDelta[point & NODE_MASK]) {
        search(point + delta, n + 1);
      }
      mVisited[point] = false;
    }
  }

  @Override
  public Z next() {
    mN += 2; // AWB always even cycle length
    if (mN >= 64) {
      throw new UnsupportedOperationException(); // exceeds implementation limits
    }
    stepDistance(mN);
    mCount = 0;
    search(ORIGIN, 0);
    return Z.valueOf(mCount / 2); // halve count, two directions around each cycle
  }
}

