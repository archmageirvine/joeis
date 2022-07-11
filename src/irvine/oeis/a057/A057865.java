package irvine.oeis.a057;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A057865 Number of simple Hamilton-connected graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A057865 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A057865() {
    super(0, 0, false, false, false);
  }

  private boolean solveHamiltonianPath(final Graph g, final int target, final long used, final int count, final int current) {
    if (current == target) {
      return count == g.order();
    }
    int v = -1;
    while ((v = g.nextVertex(current, v)) >= 0) {
      final long bit = 1L << v;
      if ((used & bit) == 0 && solveHamiltonianPath(g, target, used | bit, count + 1, v)) {
        return true;
      }
    }
    return false;
  }

  private boolean isHamiltonianPath(final Graph graph) {
    final int n = graph.order();
    if (n <= 2) {
      return true;
    }
    if (!graph.isHamiltonian()) {
      return false;
    }
    // The above test handles (u,u), we now try every other pair
    for (int u = 0; u < n; ++u) {
      for (int v = u + 1; v < n; ++v) {
        if (!solveHamiltonianPath(graph, v, 1L << u, 1, u)) {
          return false;
        }
      }
    }
    return true;
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
