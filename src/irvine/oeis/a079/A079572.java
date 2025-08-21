package irvine.oeis.a079;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A079572 Number of unlabeled, connected graphs on n vertices with no induced subgraph isomorphic to a paw, where the paw is the graph on 4 vertices, 3 of which form a triangle and the 4th vertex is adjacent to exactly one of those 3.
 * @author Sean A. Irvine
 */
public class A079572 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A079572() {
    super(0, 0, 0, () -> graph -> GraphUtils.pawFree(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
