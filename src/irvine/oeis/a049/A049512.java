package irvine.oeis.a049;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.DirectedGraph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A049512 Number of quasi-initially connected digraphs on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A049512 extends ParallelGenerateGraphsSequence {

  private static final class DigraphCheck extends DirectedGraph {
    private long mCount = 0;

    private boolean testQuasiInitiallyConnected(final Graph g, final int v, final boolean[][] reachable) {
      for (int k = 0; k < g.order(); ++k) {
        if (!reachable[k][v] && !reachable[v][k]) {
          return false;
        }
      }
      return true;
    }

    @Override
    protected void process(final Graph g) {
      // This reachability test is not as low-level as it could be, but we do make checks as we go
      final boolean[][] reachable = new boolean[g.order()][g.order()];
      for (int k = 0; k < g.order(); ++k) {
        GraphUtils.markAll(g, reachable[k], k);
      }
      // Test for quasi-initially connectedness
      for (int k = 0; k < g.order(); ++k) {
        if (testQuasiInitiallyConnected(g, k, reachable)) {
          ++mCount;
          return;
        }
      }
    }
  }

  /** Construct the sequence. */
  public A049512() {
    super(0, -1, false, false, false);
  }

  @Override
  protected long getCount(final Graph graph) {
    final DigraphCheck digraph = new DigraphCheck();
    digraph.direct(graph, 0, graph.order() - 1, Multigraph.NOLIMIT, false, false);
    return digraph.mCount;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setConnectionLevel(1);
    gg.setMaxDeg(mN);
    gg.sanitizeParams();
  }
}
