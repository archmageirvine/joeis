package irvine.oeis.a021;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A021103 Number of two-connected (or biconnected) planar graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A021103 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A021103() {
    super(-1, 2, false, false, false);
  }

  @Override
  protected long getCount(final Graph graph) {
    return graph.isPlanar() ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(2);
    gg.sanitizeParams();
  }

  @Override
  public Z next() {
    // Contortions to get expected value for n == 3
    final Z t = super.next();
    return mN == 2 ? Z.ONE : t;
  }
}
