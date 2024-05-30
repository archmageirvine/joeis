package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.Multigraph;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence1;

/**
 * A051427 Number of strictly Deza graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A051427 extends Sequence1 {

  private static final class StrictlyDeza extends ParallelGenerateGraphsSequence {

    private final int mN;
    private final int mR;

    private StrictlyDeza(final int n, final int r) {
      super(0, -1, false, false, false);
      mN = n;
      mR = r;
    }

    public boolean isDiameter2(final Graph graph) {
      boolean isTwo = false;
      for (int v = 0; v < graph.order(); ++v) {
        final int[] dv = graph.distanceVector(v);
        for (final int u : dv) {
          if (u < 0 || u > 2) {
            return false;
          }
          if (u == 2) {
            isTwo = true;
          }
        }
      }
      return isTwo;
    }

    @Override
    protected long getCount(final Graph graph) {
      if (GraphUtils.isStronglyRegular(graph)) {
        return 0;
      }
      int a = -1; // the two allowed degrees
      int b = -1;
      for (int u = 0; u < graph.order(); ++u) {
        final long nu = GraphUtils.neighbours(graph, u);
        for (int v = 0; v < u; ++v) {
          // u and v a pair of vertices
          final long nv = GraphUtils.neighbours(graph, v);
          final int cnt = Long.bitCount(nu & nv);
          if (a == -1) {
            a = cnt;
          } else if (a != cnt) {
            if (b == -1) {
              b = cnt;
            } else if (b != cnt) {
              return 0; // Not Deza
            }
          }
        }
      }
      return b >= 0 && isDiameter2(graph) ? 1 : 0;
    }

    @Override
    protected void graphGenInit(final GenerateGraphs gg) {
      gg.setVertices(mN);
      gg.setMinEdges(0);
      gg.setMaxEdges(Multigraph.NOLIMIT);
      gg.setConnectionLevel(1);
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
    // We can bound r somewhat because of diameter 2 bound
    for (int r = Functions.SQRT.i(mN - 1); r < mN; ++r) {
      sum = sum.add(new StrictlyDeza(mN, r).next());
    }
    return sum;
  }
}
