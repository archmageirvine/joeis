package irvine.oeis.a364;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A364208.
 * @author Sean A. Irvine
 */
public class A364208 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A364208() {
    super(0, -1, false, false, false);
  }

  private static final class FullSet {

    private final Graph mGraph;
    private final long mFullMask;
    private long mSeenK = 0;
    private final int[][] mEdges;

    private FullSet(final Graph graph) {
      mGraph = graph;
      mFullMask = (1L << graph.order()) - 1;
      mEdges = new int[graph.size()][2];
      int k = 0;
      for (int u = 0; u < graph.order(); ++u) {
        int v = u;
        while ((v = mGraph.nextVertex(u, v)) >= 0) {
          mEdges[k][0] = u;
          mEdges[k][1] = v;
          ++k;
        }
      }
    }

    // A terrible way of generating all possible bipartite spanning trees ...
    private void search(final long left, final long right, final int edgeNum) {
      final long seen = left | right;
      if (seen == mFullMask) {
        mSeenK |= 1L << Math.min(Long.bitCount(left), Long.bitCount(right));
        return;
      }
      if (edgeNum >= mEdges.length) {
        return;
      }
      // Consider an edge
      //  - if we have seen neither of its vertices, then try adding in both ways in turn
      //  - if we have already seen both vertices there is nothing to do
      //  - otherwise, determine which vertex is already seen and add the other to the opposite set
      search(left, right, edgeNum + 1); // choose not to use the edge
      final long a = (1L << mEdges[edgeNum][0]);
      final long b = (1L << mEdges[edgeNum][1]);
      final long forbidden = a | b;
      final long status = seen & forbidden;
      if (status == 0) {
        // Neither end seen, use both ways
        search(left | a, right | b, edgeNum + 1);
        search(left | b, right | a, edgeNum + 1);
      } else if (status != forbidden) {
        if ((seen & a) != 0) {
          if ((left & a) != 0) {
            search(left, right | b, edgeNum + 1);
          } else {
            search(left | b, right, edgeNum + 1);
          }
        } else {
          if ((left & b) != 0) {
            search(left, right | a, edgeNum + 1);
          } else {
            search(left | a, right, edgeNum + 1);
          }
        }
      }
    }

    private boolean is() {
      search(0, 0, 0);
      return Long.bitCount(mSeenK) == mGraph.order() / 2;
    }
  }

  @Override
  public long getCount(final Graph graph) {
    return new FullSet(graph).is() ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setMinDeg(0);
    gg.setMaxDeg(mN);
    gg.setConnectionLevel(1);
  }
}
