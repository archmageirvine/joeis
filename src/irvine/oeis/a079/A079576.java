package irvine.oeis.a079;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A079576 Number of unlabeled, connected graphs on n vertices that have no induced subgraph isomorphic to a gem, where a gem is a 4-path with a fifth vertex adjacent to all four of the vertices in the path.
 * @author Sean A. Irvine
 */
public class A079576 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A079576() {
    super(0, 0, 0, () -> graph -> GraphUtils.gemFree(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
