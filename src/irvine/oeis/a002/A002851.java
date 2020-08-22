package irvine.oeis.a002;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A002851 Number of unlabeled trivalent (or cubic) connected graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A002851 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A002851() {
    super(-1, -1, false, false, false);
  }

  @Override
  protected long getCount(final Graph graph) {
    return 1;
  }

  protected int degree() {
    return 3;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    final int mul = (degree() & 1) == 0 ? 1 : 2;
    gg.setVertices(mul * mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mul * mN * (mul * mN - 1) / 2);
    gg.setMinDeg(degree());
    gg.setMaxDeg(degree());
    gg.setConnectionLevel(1);
  }

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ONE;
    }
    if (mN == 0 && (degree() & 1) == 0) {
      ++mN;
      return Z.ZERO;
    }
    return super.next();
  }
}
