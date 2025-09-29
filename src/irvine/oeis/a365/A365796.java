package irvine.oeis.a365;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A365796 allocated for Jim Nastos.
 * @author Sean A. Irvine
 */
public class A365796 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A365796() {
    super(0, 0, 0, () -> graph -> GraphUtils.isAsteroidalTripleFree(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setMaxDeg(mN - 1);
    gg.setConnectionLevel(1);
  }
}
