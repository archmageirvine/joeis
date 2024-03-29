package irvine.oeis.a024;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A024607 Number of connected triangle-free graphs on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A024607 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A024607() {
    super(0, 0, false, false, true);
  }

  @Override
  public long getCount(final Graph graph) {
    return 1;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(Multigraph.NOLIMIT);
    gg.setConnectionLevel(1);
  }
}
