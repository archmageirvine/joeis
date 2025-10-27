package irvine.oeis.a389;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A389840 Number of (edge) 5-critical graphs on n vertices.
 * @author Sean A. Irvine
 */
public class A389840 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A389840() {
    super(5, 4, 0, 0, () -> graph -> {
      if (GraphUtils.isColorable(graph, 4)) {
        return 0;
      }
      for (int u = 0; u < graph.order(); ++u) {
        for (int v = graph.nextVertex(u, u); v >= 0; v = graph.nextVertex(u, v)) {
          graph.removeEdge(u, v);
          final boolean is = GraphUtils.isColorable(graph, 4);
          graph.addEdge(u, v);
          if (!is) {
            return 0;
          }
        }
      }
      return 1;
    });
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
