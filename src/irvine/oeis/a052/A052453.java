package irvine.oeis.a052;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A052453 Number of nonisomorphic (3,n) cage graphs.
 * @author Sean A. Irvine
 */
public class A052453 extends Sequence3 implements GraphProcessor {

  private int mN = 2;
  private int mM = 2;
  private long mCount = 0;

  @Override
  public void process(final Graph graph) {
    if (graph.girth() == mN) {
      ++mCount;
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    while (true) {
      mM += 2;
      final GenerateGraphs gg = new GenerateGraphs(1);
      gg.setConnectionLevel(1);
      gg.setVertices(mM);
      gg.setMinEdges(mM - 1);
      gg.setMaxEdges(mM * (mM - 1));
      gg.setMinDeg(3);
      gg.setMaxDeg(3);
      gg.setProcessor(this);
      gg.sanitizeParams();
      gg.run(false, false, false, 0, 0);
      if (mCount != 0) {
        return Z.valueOf(mCount);
      }
    }
  }
}

