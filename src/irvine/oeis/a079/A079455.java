package irvine.oeis.a079;

import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A079455 Number of unlabeled and connected graphs on n vertices which are long hole-free (i.e., the graph contains no induced cycle of size 5 or more).
 * @author Sean A. Irvine
 */
public class A079455 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A079455() {
    super(0, 0, 0, () -> graph -> !graph.hasHole(5) ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
