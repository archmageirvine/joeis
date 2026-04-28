package irvine.oeis.a022;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A022562 Number of connected claw-free unlabeled graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A022562 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A022562() {
    super(0, 0, 0, () -> graph -> GraphUtils.isClawFree(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
