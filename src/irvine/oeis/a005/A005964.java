package irvine.oeis.a005;

import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A005964 Number of trivalent connected (or cubic) planar graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A005964 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A005964() {
    super(0, 0, 0, () -> Counter.PLANAR);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(3 * mN / 2);
    gg.setMaxEdges(3 * mN / 2);
    gg.setConnectionLevel(1);
    gg.setMaxDeg(3);
    gg.setMinDeg(3);
  }

  @Override
  protected void init(final int n) {
    ++mN;
    super.init(n);
  }
}
