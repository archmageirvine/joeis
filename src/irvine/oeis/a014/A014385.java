package irvine.oeis.a014;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A014385 Number of connected regular bipartite graphs of degree 6 with <code>2n</code> nodes.
 * @author Sean A. Irvine
 */
public class A014385 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A014385() {
    super(5, -1, true, false, false);
  }

  @Override
  protected long getCount(final Graph graph) {
    return 1;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(2 * mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (2 * mN - 1));
    gg.setMinDeg(6);
    gg.setMaxDeg(6);
    gg.setConnectionLevel(1);
  }
}
