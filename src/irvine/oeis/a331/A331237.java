package irvine.oeis.a331;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A331237 Total cutting number of all trees of order <code>n</code>.
 * @author Sean A. Irvine
 */
public class A331237 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A331237() {
    super(0, 0, false, false, false);
  }

  @Override
  protected long getCount(final Graph tree) {
    return GraphUtils.cuttingNumberOfTree(tree);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN - 1);
    gg.setConnectionLevel(1);
  }
}
