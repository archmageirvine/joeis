package irvine.math.nauty;

import irvine.math.graph.Graph;
import irvine.math.graph.SmallGraph;

/**
 * Make an X-graph from nauty format.
 * @author Sean A. Irvine
 */
class MakeXGraph implements MakeH {

  @Override
  public void makeH(final Graph g, final int[] h) {
    for (int i = 0; i < g.order(); ++i) {
      int hi = 0;
      long gi = ((SmallGraph) g).getEdgeVector(i);
      while (gi != 0) {
        final int j = Long.numberOfLeadingZeros(gi);
        gi ^= GenerateGraphs.BIT[j];
        hi |= GenerateGraphs.XBIT[j];
      }
      h[i] = hi;
    }
  }
}
