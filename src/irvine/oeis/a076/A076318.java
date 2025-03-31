package irvine.oeis.a076;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A076318 Number of 6-colorable (i.e., chromatic number &lt;= 6) simple graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A076318 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A076318() {
    super(1, 0, 1, 0, () -> graph -> GraphUtils.isColorable(graph, 6) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
  }
}
