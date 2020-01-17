package irvine.oeis.a331;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A331236.
 * @author Sean A. Irvine
 */
public class A331236 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A331236() {
    super(0, 0, false, false, false);
  }

  @Override
  protected long getCount(final Graph graph) {
    return GraphUtils.cuttingNumber(graph);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setConnectionLevel(1);
  }
}
