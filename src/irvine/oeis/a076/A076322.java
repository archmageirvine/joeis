package irvine.oeis.a076;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A076322 Number of connected 3-colorable (i.e., chromatic number &lt;= 3) simple graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A076322 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A076322() {
    super(1, 0, 1, GenerateGraphs.K4_FREE, () -> graph -> GraphUtils.isColorable(graph, 3) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
