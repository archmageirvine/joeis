package irvine.oeis.a079;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A079566 Number of unlabeled, connected graphs on n vertices which have no induced subgraph isomorphic to a C4 (cycle on 4 vertices.).
 * @author Sean A. Irvine
 */
public class A079566 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A079566() {
    super(0, 0, 0, () -> graph -> GraphUtils.c4Free(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
