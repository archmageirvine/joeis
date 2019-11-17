package irvine.oeis.a027;

import irvine.math.graph.CountIndependentSets;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027666.
 * @author Sean A. Irvine
 */
public class A027667 implements Sequence {

  private int mN = -1;

  // P_3 (cf. A027667 where this is P_4)
  protected int pathLength() {
    return 3;
  }

  // The graph construction could be made faster, but it does not matter
  // since the time taken is completely dominated by counting the number
  // of independents sets.

  private int[] unpack(final int v) {
    final int[] r = new int[mN];
    for (int k = 0, u = v; k < r.length; ++k, u /= pathLength()) {
      r[k] = u % pathLength();
    }
    return r;
  }

  private int pack(final int[] v) {
    int r = 0;
    for (int k = v.length - 1; k >= 0; --k) {
      r *= pathLength();
      r += v[k];
    }
    return r;
  }

  private Graph pathPowerGraph(final int n) {
    final int m = Z.valueOf(pathLength()).pow(n).intValueExact();
    final Graph g = GraphFactory.create(m);
    if (n > 0) {
      for (int u = 0; u < g.order(); ++u) {
        final int[] v = unpack(u);
        for (int k = 0; k < v.length; ++k) {
          if (v[k] != 0 && v[k] != pathLength() - 1) {
            --v[k];
            g.addEdge(u, pack(v));
            v[k] += 2;
            g.addEdge(u, pack(v));
            --v[k];
          }
        }
      }
    }
    return g;
  }

  @Override
  public Z next() {
    return Z.valueOf(CountIndependentSets.count(pathPowerGraph(++mN)));
  }
}
