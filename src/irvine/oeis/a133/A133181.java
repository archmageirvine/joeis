package irvine.oeis.a133;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A395158.
 * @author Sean A. Irvine
 */
public class A133181 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A133181() {
    super(0, 0, 0, () -> g -> GraphUtils.isVertexTransitive(g) && GraphUtils.isEdgeTransitive(g) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
