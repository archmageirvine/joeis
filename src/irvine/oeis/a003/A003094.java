package irvine.oeis.a003;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A003094 Number of unlabeled connected planar simple graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A003094 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A003094() {
    super(-1, -1, false, false, false);
  }

  @Override
  public long getCount(final Graph graph) {
    return graph.isPlanar() ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setMinDeg(0);
    gg.setMaxDeg(mN);
    gg.setConnectionLevel(1);
  }

  @Override
  public Z next() {
    return super.next().max(Z.ONE);
  }
}
