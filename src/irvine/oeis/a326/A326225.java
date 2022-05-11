package irvine.oeis.a326;

import irvine.math.graph.Graph;
import irvine.math.nauty.DirectedGraph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A326225 Number of Hamiltonian unlabeled n-vertex digraphs (without loops).
 * @author Sean A. Irvine
 */
public class A326225 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A326225() {
    super(-1, 0, false, false, false);
  }

  private static final class DigraphCheck extends DirectedGraph {

    private long mCount = 0;

    @Override
    protected void process(final Graph graph) {
      if (graph.isHamiltonian()) {
        //System.out.println(graph);
        ++mCount;
      }
    }
  }

  @Override
  protected long getCount(final Graph graph) {
    // Given an undirected graph, convert the edges into a directed graph in all possible ways.
    // Since all the input graphs are non-isomorphic, the resulting graphs are also
    // non-isomorphic.
    final DigraphCheck digraph = new DigraphCheck();
    digraph.direct(graph, 0, graph.size(), 2 * graph.size(), false);
    return digraph.mCount;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setConnectionLevel(1);
    gg.setMinDeg(Math.min(2, mN - 1));
    gg.setMaxDeg(mN);
  }
}
