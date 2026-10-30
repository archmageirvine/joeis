package irvine.oeis.a058;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A395158 Number of 2-connected claw-free labeled cubic graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A058932 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A058932() {
    super(0, 7, 0, () -> g -> g.isBiconnected() ? 0 : 1);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(2 * mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(2 * mN * (2 * mN - 1) / 2);
    gg.setMinDeg(3);
    gg.setMaxDeg(3);
    gg.setConnectionLevel(1);
    gg.setPruner((g, n) -> !GraphUtils.isClawFree(g));
  }

  @Override
  public Z next() {
    if (mN >= 14) {
      throw new UnsupportedOperationException(); // exceeds nauty
    }
    return super.next();
  }
}
