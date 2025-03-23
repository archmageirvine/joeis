package irvine.math.nauty;

import irvine.math.graph.Graph;
import irvine.math.graph.SmallGraph;

/**
 * Make X-format graph for cycle lengths in mask plus 5-cycles.
 * @author Sean A. Irvine
 */
class MakePlus5Graph implements MakeH {

  private final long mMask;

  MakePlus5Graph(final long mask) {
    mMask = mask;
  }

  @Override
  public void makeH(final Graph g, final int[] h) {
    long x3 = 0;
    long x4 = 0;
    if ((GenerateGraphs.BIT[3] & mMask) != 0) {
      x3 = ~x3;
    }
    if ((GenerateGraphs.BIT[4] & mMask) != 0) {
      x4 = ~x4;
    }
    for (int v0 = 0; v0 < g.order(); ++v0) {
      long x = 0;
      long w3 = ((SmallGraph) g).getEdgeVector(v0);
      while (w3 != 0) {
        final int v3 = Long.numberOfLeadingZeros(w3);
        w3 ^= GenerateGraphs.BIT[v3];
        x |= (x3 & GenerateGraphs.XBIT[v3]);
        long w4 = ((SmallGraph) g).getEdgeVector(v3) & ~GenerateGraphs.BIT[v0];
        while (w4 != 0) {
          final int v4 = Long.numberOfLeadingZeros(w4);
          w4 ^= GenerateGraphs.BIT[v4];
          x |= (x4 & GenerateGraphs.XBIT[v4]);
          long w5 = ((SmallGraph) g).getEdgeVector(v4) & ~GenerateGraphs.BIT[v0] & ~GenerateGraphs.BIT[v3];
          while (w5 != 0) {
            final int v5 = Long.numberOfLeadingZeros(w5);
            w5 ^= GenerateGraphs.BIT[v5];
            x |= GenerateGraphs.XBIT[v5];
          }
        }
      }
      h[v0] = (int) x;
    }
  }
}
