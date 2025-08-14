package irvine.oeis.a079;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A079453 Number of unlabeled and connected graphs on n vertices which are HH-free ("house-hole-free").
 * @author Sean A. Irvine
 */
public class A079453 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A079453() {
    super(0, 0, 0, () -> graph -> GraphUtils.houseFree(graph) && !graph.hasHole(5) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
