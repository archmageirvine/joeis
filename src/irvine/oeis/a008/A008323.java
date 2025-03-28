package irvine.oeis.a008;

import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence0;

/**
 * A008323 Number of simple connected regular bipartite graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A008323 extends Sequence0 {

  static class RegularConnectedBipartiteGenerator extends ParallelGenerateGraphsSequence {

    private final int mR;
    private final boolean mConnected;

    RegularConnectedBipartiteGenerator(final int n, final int r, final boolean connected) {
      super(n - 1, 0, GenerateGraphs.BIPARTITE, () -> Counter.ONE);
      mR = r;
      mConnected = connected;
    }

    @Override
    protected void graphGenInit(final GenerateGraphs gg) {
      gg.setConnectionLevel(mConnected ? 1 : 0);
      gg.setVertices(2 * mN);
      gg.setMinDeg(mR);
      gg.setMaxDeg(mR);
      gg.setMinEdges(mR * mN);
      gg.setMaxEdges(mR * mN);
    }
  }

  protected boolean connected() {
    return true;
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int r = 0; r <= mN; ++r) {
      final RegularConnectedBipartiteGenerator gen = new RegularConnectedBipartiteGenerator(mN, r, connected());
      sum = sum.add(gen.next());
    }
    return sum;
  }
}


