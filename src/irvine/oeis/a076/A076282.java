package irvine.oeis.a076;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A076282 Number of 6-chromatic (i.e., chromatic number equals 6) simple graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A076282 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A076282() {
    super(1, 0, 6, 0, () -> graph -> !GraphUtils.isBipartite(graph)
      && !GraphUtils.isColorable(graph, 3)
      && !GraphUtils.isColorable(graph, 4)
      && !GraphUtils.isColorable(graph, 5)
      && GraphUtils.isColorable(graph, 6)
      ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
  }
}
