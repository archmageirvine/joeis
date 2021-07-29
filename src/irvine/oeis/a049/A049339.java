package irvine.oeis.a049;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A049339 Number of n-node planar graphs with even degrees.
 * @author Sean A. Irvine
 */
public class A049339 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A049339() {
    super(0, 0, false, false, false);
  }

  private boolean isEvenDegree(final Graph graph) {
    for (int k = 0; k < graph.order(); ++k) {
      if ((graph.degree(k) & 1) == 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public long getCount(final Graph graph) {
    return isEvenDegree(graph) && graph.isPlanar() ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setMinDeg(0);
    gg.setMaxDeg(mN);
    gg.setConnectionLevel(0);
  }
}
