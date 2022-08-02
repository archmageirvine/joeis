package irvine.oeis.a058;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A058276 Number of connected 6-regular simple graphs on n vertices with girth at least 4.
 * @author Sean A. Irvine
 */
public class A058276 extends ParallelGenerateGraphsSequence {

  private boolean mFirst = true;

  /** Construct the sequence. */
  public A058276() {
    super(0, 0, false, false, false);
  }

  @Override
  protected long getCount(final Graph graph) {
    return graph.order() == 0 || graph.girth() >= 4 ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(3 * mN);
    gg.setMaxEdges(3 * mN);
    gg.setMinDeg(6);
    gg.setMaxDeg(6);
    gg.setConnectionLevel(1);
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next();
  }
}
