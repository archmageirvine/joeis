package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A046091 Number of connected planar graphs with n edges.
 * @author Sean A. Irvine
 */
public class A046091 extends Sequence0 {

  private static class MySequence extends ParallelGenerateGraphsSequence {

    private final int mVertices;
    private final int mEdges;

    MySequence(final int n, final int m) {
      super(0, 0, false, false, false);
      mVertices = n;
      mEdges = m;
    }

    @Override
    protected long getCount(final Graph graph) {
      return graph.isPlanar() ? 1 : 0;
    }

    @Override
    protected void graphGenInit(final GenerateGraphs gg) {
      gg.setVertices(mVertices);
      gg.setMinEdges(mEdges);
      gg.setMaxEdges(mEdges);
      gg.setConnectionLevel(1);
    }
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int v = (1 + Functions.SQRT.i(1 + 8L * mN)) / 2; v <= mN + 1; ++v) {
      final Sequence seq = new MySequence(v, mN);
      sum = sum.add(seq.next());
    }
    return sum;
  }
}
