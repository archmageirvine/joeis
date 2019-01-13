package irvine.oeis.a008;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence;

/**
 * A008323.
 * @author Sean A. Irvine
 */
public class A008323 implements Sequence {

  static class RegularConnectedBipartiteGenerator extends ParallelGenerateGraphsSequence {

    private final int mR;
    private final boolean mConnected;

    RegularConnectedBipartiteGenerator(final int n, final int r, final boolean connected) {
      super(n - 1, 0, true, false, false);
      mR = r;
      mConnected = connected;
    }

    @Override
    protected boolean accept(final Graph graph) {
      return true;
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

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int r = 0; r <= mN; ++r) {
      final RegularConnectedBipartiteGenerator gen = new RegularConnectedBipartiteGenerator(mN, r, connected());
      sum = sum.add(gen.next());
    }
    return sum;
  }
}


