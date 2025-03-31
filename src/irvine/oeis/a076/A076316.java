package irvine.oeis.a076;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A076316 Number of 4-colorable (i.e., chromatic number &lt;= 4) simple graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A076316 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A076316() {
    super(1, 0, 1, GenerateGraphs.K5_FREE, () -> graph -> GraphUtils.isColorable(graph, 4) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
  }
}
