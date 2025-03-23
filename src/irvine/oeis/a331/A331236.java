package irvine.oeis.a331;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A331236 Total cutting number of all simple connected graphs of order n.
 * @author Sean A. Irvine
 */
public class A331236 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A331236() {
    super(0, 0, 0, () -> GraphUtils::cuttingNumber);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
