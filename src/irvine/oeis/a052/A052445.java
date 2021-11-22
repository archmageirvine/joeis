package irvine.oeis.a052;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A052445 Number of simple unlabeled n-node graphs of connectivity 4.
 * @author Sean A. Irvine
 */
public class A052445 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A052445() {
    super(0, 5, false, false, false);
  }

  @Override
  protected long getCount(final Graph graph) {
    return GraphUtils.isKConnected(graph, 4) && !GraphUtils.isKConnected(graph, 5) ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setConnectionLevel(2);
  }
}
