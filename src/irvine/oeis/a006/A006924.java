package irvine.oeis.a006;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006924 Number of connected trivalent graphs with 2n nodes and girth exactly 4.
 * @author Sean A. Irvine
 */
public class A006924 extends Sequence0 implements GraphProcessor {

  private int mN = -2;
  protected long mCount = 0;

  protected int girth() {
    return 4;
  }

  @Override
  public void process(final Graph graph) {
    if (graph.girth() == girth()) {
      ++mCount;
    }
  }

  protected Z initial() {
    return Z.ZERO;
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return initial();
    }
    mCount = 0;
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setMaxDeg(3);
    gg.setMinDeg(3);
    gg.setConnectionLevel(1);
    gg.setVertices(mN);
    gg.setMaxEdges((mN * mN - mN) / 2);
    gg.sanitizeParams();
    gg.setProcessor(this);
    gg.run(false, girth() > 4, girth() > 3, 0, 0);
    return Z.valueOf(mCount);
  }
}

