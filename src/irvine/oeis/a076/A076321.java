package irvine.oeis.a076;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A076321 Number of 9-colorable (i.e., chromatic number &lt;= 9) simple graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A076321 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A076321() {
    super(1, 0, 1, 0, () -> graph -> GraphUtils.isColorable(graph, 9) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
  }
}
