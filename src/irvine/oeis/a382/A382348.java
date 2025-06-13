package irvine.oeis.a382;

import irvine.math.function.Functions;
import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence1;

/**
 * A382348 Number of connected bipartite graphs with n edges.
 * @author Sean A. Irvine
 */
public class A382348 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final int e = ++mN;
    Z sum = Z.ZERO;
    for (int v = Functions.SQRT.i(4 * mN); v <= mN + 1; ++v) {
      final int u = v;
      final Z cnt = new ParallelGenerateGraphsSequence(0, v - 1, 0, GenerateGraphs.BIPARTITE, () -> Counter.ONE) {
        @Override
        protected void graphGenInit(final GenerateGraphs gg) {
          gg.setVertices(u);
          gg.setConnectionLevel(1);
          gg.setMinEdges(e);
          gg.setMaxEdges(e);
        }
      }.next();
      //System.out.println("n=" + v + " e=" + mN + " " + cnt);
      sum = sum.add(cnt);
    }
    return sum;
  }
}
