package irvine.oeis.a076;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A076320 Number of 8-colorable (i.e., chromatic number &lt;= 8) simple graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A076320 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A076320() {
    super(1, 0, 1, 0, () -> graph -> GraphUtils.isColorable(graph, 8) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
  }
}
