package irvine.oeis.a079;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A079573 Number of unlabeled, connected graphs on n vertices with no induced subgraph isomorphic to a diamond, where a diamond is the graph on four vertices formed by removing an edge from the complete graph K4.
 * @author Sean A. Irvine
 */
public class A079573 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A079573() {
    super(0, 0, 0, () -> graph -> GraphUtils.diamondFree(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
