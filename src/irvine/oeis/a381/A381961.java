package irvine.oeis.a381;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A381961 Number of connected graphs with n vertices which have a planar square.
 * @author Sean A. Irvine
 */
public class A381961 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A381961() {
    super(-1, -1, GenerateGraphs.PENTAGON_FREE, () -> graph -> GraphUtils.square(graph).isPlanar() ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setMinDeg(1);
    gg.setMaxDeg(3);
    gg.setConnectionLevel(1);
  }
}
