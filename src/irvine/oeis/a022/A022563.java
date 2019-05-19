package irvine.oeis.a022;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A022563.
 * @author Sean A. Irvine
 */
public class A022563 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A022563() {
    super(0, 2, false, false, false);
  }

  @Override
  protected boolean accept(final Graph graph) {
    return A022562.isClawFree(graph);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(2);
  }
}
