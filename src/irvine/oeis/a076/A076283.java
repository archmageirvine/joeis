package irvine.oeis.a076;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A076283 Number of 7-chromatic (i.e., chromatic number equals 7) simple graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A076283 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A076283() {
    super(1, 0, 7, 0, () -> graph -> !GraphUtils.isBipartite(graph)
      && !GraphUtils.isColorable(graph, 3)
      && !GraphUtils.isColorable(graph, 4)
      && !GraphUtils.isColorable(graph, 5)
      && !GraphUtils.isColorable(graph, 6)
      && GraphUtils.isColorable(graph, 7)
      ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
  }
}
