package irvine.oeis.a330;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A330333 Number of diameter-2-critical graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A330333 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A330333() {
    super(2, 2, 0, () -> graph -> graph.diameter() == 2 && isCritical(graph) ? 1 : 0);
  }

  private static boolean isCritical(final Graph graph) {
    for (int u = 0; u < graph.order(); ++u) {
      for (int v = graph.nextVertex(u, u); v >= 0; v = graph.nextVertex(u, v)) {
        graph.removeEdge(u, v);
        if (graph.isConnected() && graph.diameter() <= 2) {
          return false;
        }
        graph.addEdge(u, v);
      }
    }
    return true;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
