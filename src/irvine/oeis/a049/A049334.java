package irvine.oeis.a049;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049334 Triangle read by rows: T(n, k) is the number of unlabeled connected planar simple graphs with n &gt;= 1 nodes and 0&lt;=k&lt;=3*n-6 edges.
 * @author Sean A. Irvine
 */
public class A049334 implements Sequence, GraphProcessor {

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
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(mN);
    gg.setMinEdges(mM);
    gg.setMaxEdges(mM);
    gg.setConnectionLevel(1);
    gg.setMaxDeg(mN - 1);
    gg.setProcessor(this);
    gg.sanitizeParams();
    mPlanarCount = 0;
    gg.run(false, false, false, 0, 0);
    return Z.valueOf(mPlanarCount);
  }
}
