package irvine.oeis.a049;

import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A049369 Number of n-node planar graphs with minimum degree at least 1.
 * @author Sean A. Irvine
 */
public class A049369 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A049369() {
    super(0, 2, false, false, false, () -> Counter.PLANAR);
  }

  protected int minDegree() {
    return 1;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setMinDeg(minDegree());
  }
}
