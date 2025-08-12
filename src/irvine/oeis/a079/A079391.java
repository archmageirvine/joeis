package irvine.oeis.a079;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A079391 Number of (simple, undirected, unlabeled, connected) graphs with n vertices which contain no induced subgraph isomorphic to C5 (cycle on 5 vertices), P5 (path on 5 vertices) or complement of P5.
 * @author Sean A. Irvine
 */
public class A079391 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A079391() {
    super(0, 0, 0, () -> graph -> GraphUtils.c5Free(graph) && GraphUtils.houseFree(graph) && GraphUtils.p5Free(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
