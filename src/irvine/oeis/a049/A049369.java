package irvine.oeis.a049;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A049369 Number of planar graphs with minimum degree at least 1 and n nodes.
 * @author Sean A. Irvine
 */
public class A049369 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A049369() {
    super(0, 2, false, false, false);
  }

  @Override
  public long getCount(final Graph graph) {
    return graph.isPlanar() ? 1 : 0;
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
