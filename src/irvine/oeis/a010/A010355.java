package irvine.oeis.a010;

import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence1;

/**
 * A010355 Number of unlabeled nonseparable (or 2-connected) graphs (or blocks) with n edges.
 * @author Sean A. Irvine
 */
public class A010355 extends Sequence1 {

  private int mEdges = 0;

  @Override
  public Z next() {
    if (++mEdges == 1) {
      return Z.ONE;
    }
    Z count = Z.ZERO;
    final ParallelGenerateGraphsSequence pgs = new ParallelGenerateGraphsSequence(0, 1, 2, 0, () -> Counter.ONE) {
      @Override
      protected void graphGenInit(final GenerateGraphs gg) {
        gg.setVertices(mN);
        gg.setConnectionLevel(2); // biconnected
        gg.setMinEdges(mEdges);
        gg.setMaxEdges(mEdges);
      }
    };
    for (int k = 2; k <= mEdges; ++k) {
      final Z cnt = pgs.next();
      count = count.add(cnt);
    }
    return count;
  }
}

