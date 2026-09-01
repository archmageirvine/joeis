package irvine.oeis.a304;

import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A304124 Number of simple graphs with n vertices which contain no K4 subgraph.
 * @author Sean A. Irvine
 */
public class A304124 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A304124() {
    super(0, 0, GenerateGraphs.K4_FREE, () -> Counter.ONE);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(0);
  }
}
