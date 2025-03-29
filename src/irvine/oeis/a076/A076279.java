package irvine.oeis.a076;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A076253.
 * @author Sean A. Irvine
 */
public class A076279 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A076279() {
    super(1, 0, 3, GenerateGraphs.K4_FREE, () -> graph -> !GraphUtils.isBipartite(graph) && GraphUtils.isColorable(graph, 3) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
  }
}
