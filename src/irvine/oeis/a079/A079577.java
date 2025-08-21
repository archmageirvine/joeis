package irvine.oeis.a079;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A079577 Number of unlabeled, connected graphs on n vertices that have no induced subgraph isomorphic to a bull, a P5 or a P5-bar.
 * @author Sean A. Irvine
 */
public class A079577 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A079577() {
    super(0, 0, 0, () -> graph -> GraphUtils.p5Free(graph) && GraphUtils.houseFree(graph) && GraphUtils.bullFree(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
