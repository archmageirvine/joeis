package irvine.oeis.a006;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A006787 Number of n-node graphs with no cycles of length less than 5.
 * @author Sean A. Irvine
 */
public class A006787 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A006787() {
    super(0, 0, false, true, true);
  }

  @Override
  protected boolean accept(final Graph graph) {
    return true;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
  }
}
