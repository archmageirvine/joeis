package irvine.oeis.a076;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A076253.
 * @author Sean A. Irvine
 */
public class A076281 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A076281() {
    super(1, 0, 5, 0, () -> graph -> !GraphUtils.isBipartite(graph)
      && !GraphUtils.isColorable(graph, 3)
      && !GraphUtils.isColorable(graph, 4)
      && GraphUtils.isColorable(graph, 5)
      ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
  }
}
