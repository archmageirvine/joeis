package irvine.oeis.a086;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A086216 Number of 4-connected unlabeled n-node graphs.
 * @author Sean A. Irvine
 */
public class A086216 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A086216() {
    super(0, 5, 0, () -> graph -> GraphUtils.isKConnected(graph, 4) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setConnectionLevel(2);
  }
}
