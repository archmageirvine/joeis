package irvine.oeis.a122;

import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A122113 Number of pairwise non-isomorphic biconnected planar bipartite graphs on n vertices.
 * @author Sean A. Irvine
 */
public class A122113 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A122113() {
    super(3, 3, GenerateGraphs.BIPARTITE, () -> Counter.ONE);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(2);
    gg.setPruner((graph, n) -> !graph.isPlanar());
  }
}
