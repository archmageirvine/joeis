package irvine.oeis.a049;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049340 Triangle read by rows: T(n,k) is the number of planar graphs with n &gt;= 1 nodes and 0 &lt;= k &lt;= binomial(n,2) edges, all degrees even.
 * @author Sean A. Irvine
 */
public class A049340 implements Sequence, GraphProcessor {

  private int mN = 0;
  private int mM = 0;
  private long mPlanarCount = 0;

  private boolean isEvenDegree(final Graph graph) {
    for (int k = 0; k < graph.order(); ++k) {
      if ((graph.degree(k) & 1) == 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public void process(final Graph graph) {
    if (isEvenDegree(graph) && graph.isPlanar()) {
      ++mPlanarCount;
    }
  }

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1) / 2) {
      ++mN;
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
    mPlanarCount = 0;
    try {
      gg.run(false, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e); // We are not generating output anyway
    }
    return Z.valueOf(mPlanarCount);
  }
}
