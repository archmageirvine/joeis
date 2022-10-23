package irvine.oeis.a049;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049336 Table read by rows: T(n,k) = number of 2-connected planar graphs with n &gt;= 1 nodes and 0 &lt;= k &lt;= 3n-6 edges.
 * @author Sean A. Irvine
 */
public class A049336 extends Sequence1 implements GraphProcessor {

  private int mN = 0;
  private int mM = 0;
  private long mPlanarCount = 0;

  @Override
  public void process(final Graph graph) {
    if (graph.isPlanar()) {
      ++mPlanarCount;
    }
  }

  @Override
  public Z next() {
    if (++mM > Math.max(mN - 1, 3 * mN - 6)) {
      ++mN;
      mM = 0;
    }
    if (mN == 1) {
      return Z.ZERO;
    }
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(mN);
    gg.setMinEdges(mM);
    gg.setMaxEdges(mM);
    gg.setConnectionLevel(2);
    gg.setMaxDeg(mN - 1);
    gg.setProcessor(this);
    gg.sanitizeParams();
    mPlanarCount = 0;
    gg.run(false, false, false, 0, 0);
    return Z.valueOf(mPlanarCount);
  }
}
