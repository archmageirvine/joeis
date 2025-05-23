package irvine.oeis.a006;

import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A006824 Number of connected regular bipartite graphs of degree 4 with 2n nodes.
 * @author Sean A. Irvine
 */
public class A006824 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A006824() {
    super(3, 0, GenerateGraphs.BIPARTITE, () -> Counter.ONE);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    final int n = 2 * mN;
    gg.setVertices(n);
    gg.setMinEdges(0);
    gg.setMaxEdges(n * (n - 1) / 2);
    gg.setMinDeg(4);
    gg.setMaxDeg(4);
    gg.setConnectionLevel(1);
  }
}
