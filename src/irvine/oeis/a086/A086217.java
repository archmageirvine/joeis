package irvine.oeis.a086;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A086217 Number of 5-connected graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A086217 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A086217() {
    super(0, 6, 0, () -> graph -> GraphUtils.isKConnected(graph, 5) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setConnectionLevel(2);
  }
}
