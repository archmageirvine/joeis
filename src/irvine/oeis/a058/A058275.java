package irvine.oeis.a058;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A058275 Number of connected 5-regular simple graphs on <code>2n</code> vertices with girth at least 4.
 * @author Sean A. Irvine
 */
public class A058275 extends ParallelGenerateGraphsSequence {

  private boolean mFirst = true;

  /** Construct the sequence. */
  public A058275() {
    super(0, 0, false, false, false);
  }

  @Override
  protected long getCount(final Graph graph) {
    return graph.order() == 0 || graph.girth() >= 4 ? 1 : 0;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(5 * mN / 2);
    gg.setMaxEdges(5 * mN / 2);
    gg.setMinDeg(5);
    gg.setMaxDeg(5);
    gg.setConnectionLevel(1);
  }

  @Override
  protected void init(final int n) {
    ++mN;
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
