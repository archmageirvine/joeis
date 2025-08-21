package irvine.oeis.a079;

import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A079574 Number of unlabeled, connected graphs on n vertices with no induced subgraph isomorphic to a K_4, where a K_4 is the complete graph on four vertices.
 * @author Sean A. Irvine
 */
public class A079574 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A079574() {
    super(0, 0, GenerateGraphs.K4_FREE, () -> Counter.ONE);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
