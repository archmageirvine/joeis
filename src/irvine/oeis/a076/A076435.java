package irvine.oeis.a076;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence;

/**
 * A076435 Number of strongly regular simple graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A076435 implements Sequence {

  private static final class StronglyRegular extends ParallelGenerateGraphsSequence {

    private final int mN;
    private final int mR;

    private StronglyRegular(final int n, final int r) {
      super(0, -1, false, false, false);
      mN = n;
      mR = r;
    }

    @Override
    protected long getCount(final Graph graph) {
      return GraphUtils.isStronglyRegular(graph) ? 1 : 0;
    }

    @Override
    protected void graphGenInit(final GenerateGraphs gg) {
      gg.setVertices(mN);
      gg.setMinEdges(0);
      gg.setMaxEdges(Multigraph.NOLIMIT);
      gg.setConnectionLevel(0);
      gg.setMinDeg(mR);
      gg.setMaxDeg(mR);
      gg.sanitizeParams();
    }
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int r = 0; r < mN; ++r) {
      sum = sum.add(new StronglyRegular(mN, r).next());
    }
    return sum;
  }
}
