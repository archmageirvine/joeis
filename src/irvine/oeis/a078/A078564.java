package irvine.oeis.a078;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A078564 Number of (simple, undirected, unlabeled, connected) graphs with n vertices which contain no induced subgraph isomorphic to the complement of P5 (the "house" graph).
 * @author Sean A. Irvine
 */
public class A078564 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A078564() {
    super(0, 0, 0, () -> graph -> GraphUtils.houseFree(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
