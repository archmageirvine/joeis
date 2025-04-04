package irvine.oeis.a024;

import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A024607 Number of connected triangle-free graphs on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A024607 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A024607() {
    super(0, 0, GenerateGraphs.TRIANGLE_FREE | 0, () -> Counter.ONE);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setConnectionLevel(1);
  }
}
