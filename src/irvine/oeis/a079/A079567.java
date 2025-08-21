package irvine.oeis.a079;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A079567 Number of unlabeled, connected graphs on n vertices which have no induced subgraph isomorphic to a P5, P5-bar or C5 and are not bipartite nor cobipartite and are primes.
 * @author Sean A. Irvine
 */
public class A079567 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A079567() {
    super(0, 5, 0, () -> graph -> !GraphUtils.isBipartite(graph) && GraphUtils.houseFree(graph) && GraphUtils.p5Free(graph) && GraphUtils.c5Free(graph) && !GraphUtils.isBipartite(graph.complement()) && GraphUtils.isPrime(graph) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
