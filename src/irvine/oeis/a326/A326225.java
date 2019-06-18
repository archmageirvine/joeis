package irvine.oeis.a326;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.nauty.DirectedGraph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A326225 allocated for Gus Wiseman.
 * @author Sean A. Irvine
 */
public class A326225 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A326225() {
    super(0, 0, false, false, false);
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
    final DigraphCheck mDigraph = new DigraphCheck();
    try {
      mDigraph.direct(graph, 0, graph.size(), 2 * graph.size(), false, graph.order());
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    return mDigraph.mCount;
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
