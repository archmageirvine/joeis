package irvine.oeis.a057;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A057864 Number of simple traceable graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A057864 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A057864() {
    super(0, 0, false, false, false);
  }

  private boolean solveHamiltonianPath(final Graph g, final long used, final int count, final int current) {
    if (count == g.order()) {
      return true;
    }
    int v = -1;
    while ((v = g.nextVertex(current, v)) >= 0) {
      final long bit = 1L << v;
      if ((used & bit) == 0 && solveHamiltonianPath(g, used | bit, count + 1, v)) {
        return true;
      }
    }
    return false;
  }

  private boolean isHamiltonianPath(final Graph graph) {
    final int n = graph.order();
    if (n == 1) {
      return true;
    }
    // Recursive path finding.
    for (int v = 0; v < n; ++v) {
      if (solveHamiltonianPath(graph, 1L << v, 1, v)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public long getCount(final Graph graph) {
    return isHamiltonianPath(graph) ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setMinDeg(1);
    gg.setMaxDeg(mN);
    gg.setConnectionLevel(1);
  }
}
