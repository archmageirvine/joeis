package irvine.oeis.a051;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A051175.
 * @author Sean A. Irvine
 */
public class A051175 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A051175() {
    super(0, 9, false, false, false);
  }

  @Override
  protected long getCount(final Graph graph) {
    return graph.wienerIndex() == graph.lineGraph().lineGraph().wienerIndex() ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    // generate trees
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN - 1);
    gg.setConnectionLevel(1);
  }
}
