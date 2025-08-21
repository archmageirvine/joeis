package irvine.oeis.a079;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A079569 Number of unlabeled, connected graphs on n vertices which have no induced subgraph isomorphic to a P5 and are chordal and prime.
 * @author Sean A. Irvine
 */
public class A079569 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A079569() {
    super(0, 4, 0, () -> graph -> GraphUtils.p5Free(graph) && GraphUtils.isPrime(graph) && graph.isChordal() ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
