package irvine.oeis.a079;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A079575 Number of unlabeled, connected graphs on n vertices with no induced subgraph isomorphic to a bull-graph.
 * @author Sean A. Irvine
 */
public class A079575 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A079575() {
    super(0, 0, 0, () -> graph -> GraphUtils.bullFree(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
