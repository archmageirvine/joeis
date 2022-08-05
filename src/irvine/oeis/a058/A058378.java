package irvine.oeis.a058;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A058378 Number of trivalent 2-connected planar graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A058378 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A058378() {
    super(0, 0, false, false, false);
  }

  @Override
  protected long getCount(final Graph graph) {
    return graph.isPlanar() ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(3 * mN / 2);
    gg.setMaxEdges(3 * mN / 2);
    gg.setConnectionLevel(2);
    gg.setMaxDeg(3);
    gg.setMinDeg(3);
  }

  @Override
  protected void init(final int n) {
    ++mN;
    super.init(n);
  }
}
