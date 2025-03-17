package irvine.oeis.a049;

import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A024607 Number of connected triangle-free graphs on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A049368 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A049368() {
    super(0, 0, false, false, true, () -> Counter.PLANAR);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setConnectionLevel(1);
  }
}
