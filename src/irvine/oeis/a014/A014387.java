package irvine.oeis.a014;

import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A014387 Number of connected regular bipartite graphs of degree 7 with 2n nodes.
 * @author Sean A. Irvine
 */
public class A014387 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A014387() {
    super(6, -1, GenerateGraphs.BIPARTITE, () -> Counter.ONE);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(2 * mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (2 * mN - 1));
    gg.setMinDeg(7);
    gg.setMaxDeg(7);
    gg.setConnectionLevel(1);
  }
}
