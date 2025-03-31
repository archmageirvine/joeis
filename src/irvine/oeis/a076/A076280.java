package irvine.oeis.a076;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A076280 Number of 4-chromatic (i.e., chromatic number equals 4) simple graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A076280 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A076280() {
    super(1, 0, 4, GenerateGraphs.K5_FREE, () -> graph -> !GraphUtils.isBipartite(graph)
      && !GraphUtils.isColorable(graph, 3)
      && GraphUtils.isColorable(graph, 4)
      ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
  }
}
