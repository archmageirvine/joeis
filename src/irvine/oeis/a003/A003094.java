package irvine.oeis.a003;

import irvine.math.nauty.Counter;
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
    super(-1, -1, 0, () -> Counter.ONE);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setMinDeg(0);
    gg.setMaxDeg(mN);
    gg.setConnectionLevel(1);
    gg.setPruner((graph, n) -> !graph.isPlanar());
  }

  @Override
  public Z next() {
    return super.next();
  }
}
