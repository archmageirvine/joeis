package irvine.oeis.a021;

import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A021103 Number of two-connected (or biconnected) planar graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A021103 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A021103() {
    super(-1, 3, false, false, false, false, () -> graph -> graph.isPlanar() ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(2);
    gg.sanitizeParams();
  }
}
