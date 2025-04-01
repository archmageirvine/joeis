package irvine.oeis.a076;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A076328 Number of connected 9-colorable (i.e., chromatic number &lt;= 9) simple graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A076328 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A076328() {
    super(1, 0, 1, 0, () -> graph -> GraphUtils.isColorable(graph, 9) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
