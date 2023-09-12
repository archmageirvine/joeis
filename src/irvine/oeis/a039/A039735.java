package irvine.oeis.a039;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039735 Triangle read by rows: T(n,k) = number of nonisomorphic unlabeled planar graphs with n &gt;= 1 nodes and 0 &lt;= k &lt;= 3n-6 edges.
 * @author Sean A. Irvine
 */
public class A039735 extends Sequence1 implements GraphProcessor {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -1;
  private int mM = 0;
  private long mGenCount = 0;
  private long mPlanarCount = 0;

  @Override
  public void process(final Graph graph) {
    ++mGenCount;
    if (graph.isPlanar()) {
      ++mPlanarCount;
    }
  }

  @Override
  public Z next() {
    if (++mM > 3 * mN - 6) {
      if (++mN == 0) {
        return Z.ONE;
      }
      mM = 0;
    }
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(mN);
    gg.setMinEdges(mM);
    gg.setMaxEdges(mM);
    gg.setConnectionLevel(0);
    gg.setMaxDeg(mN - 1);
    gg.setProcessor(this);
    gg.sanitizeParams();
    mGenCount = 0;
    mPlanarCount = 0;
    gg.run(false, false, false, 0, 0);
    if (mVerbose) {
      System.out.println("Undirected generated count was " + mGenCount);
    }
    return Z.valueOf(mPlanarCount);
  }
}
