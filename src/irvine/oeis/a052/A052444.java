package irvine.oeis.a052;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A052444 Number of simple unlabeled n-node graphs of connectivity 3.
 * @author Sean A. Irvine
 */
public class A052444 extends ParallelGenerateGraphsSequence {

  // There is probably a cycle index approach for this ...

  /** Construct the sequence. */
  public A052444() {
    super(0, 4, false, false, false);
  }

  @Override
  protected long getCount(final Graph graph) {
    return GraphUtils.isKConnected(graph, 3) && !GraphUtils.isKConnected(graph, 4) ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setConnectionLevel(2);
  }
}
