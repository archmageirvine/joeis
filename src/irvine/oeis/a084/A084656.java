package irvine.oeis.a084;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A084656 Number of unlabeled connected claw-free cubic graphs on 2n vertices.
 * @author Sean A. Irvine
 */
public class A084656 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A084656() {
    super(1, 0, 2, 0, () -> graph -> GraphUtils.isClawFree(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(2 * mN);
    gg.setMinEdges(0);
    gg.setMinDeg(3);
    gg.setMaxDeg(3);
    gg.setMaxEdges(2 * mN * (2 * mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
