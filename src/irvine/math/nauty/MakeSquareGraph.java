package irvine.math.nauty;

import irvine.math.graph.Graph;
import irvine.math.graph.SmallGraph;

/**
 * Make X-format square graph.
 * @author Sean A. Irvine
 */
class MakeSquareGraph implements MakeH {
  @Override
  public void makeH(final Graph g, final int[] h) {
    for (int i = 0; i < g.order(); ++i) {
      long w = ((SmallGraph) g).getEdgeVector(i);
      long x = 0;
      while (w != 0) {
        final int j = Long.numberOfLeadingZeros(w);
        w ^= GenerateGraphs.BIT[j];
        x |= ((SmallGraph) g).getEdgeVector(j);
      }
      x &= ~GenerateGraphs.BIT[i];
      int hi = 0;
      while (x != 0) {
        final int j = Long.numberOfLeadingZeros(x);
        x ^= GenerateGraphs.BIT[j];
        hi |= GenerateGraphs.XBIT[j];
      }
      h[i] = hi;
    }
  }
}
