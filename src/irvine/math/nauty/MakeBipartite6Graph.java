package irvine.math.nauty;

import irvine.math.graph.Graph;
import irvine.math.graph.SmallGraph;

/**
 * Make X-format bipartite girth six graph.
 * @author Sean A. Irvine
 */
class MakeBipartite6Graph extends MakeBipartiteGraph {
  @Override
  public void makeH(final Graph g, final int[] h) {
    long w, x;
    int hi;
    int j;

    super.makeH(g, h);

    for (int i = 0; i < g.order(); ++i) {
      w = ((SmallGraph) g).getEdgeVector(i);
      x = 0;
      while (w != 0) {
        j = Long.numberOfLeadingZeros(w);
        w ^= GenerateGraphs.BIT[j];
        x |= ((SmallGraph) g).getEdgeVector(j);
      }
      x &= ~GenerateGraphs.BIT[i];
      hi = h[i];
      while (x != 0) {
        j = Long.numberOfLeadingZeros(x);
        x ^= GenerateGraphs.BIT[j];
        hi |= GenerateGraphs.XBIT[j];
      }
      h[i] = hi;
    }
  }
}
