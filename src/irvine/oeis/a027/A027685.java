package irvine.oeis.a027;

import irvine.math.graph.CountIndependentSets;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027685 Number of independent subsets of <code>4^n</code> torus graph.
 * @author Sean A. Irvine
 */
public class A027685 implements Sequence {

  // This is only good for a small number of terms

  private int mN = -1;

  // C_4
  protected int cycleLength() {
    return 4;
  }

  // The graph construction could be made faster, but it does not matter
  // since the time taken is completely dominated by counting the number
  // of independents sets.

  private int[] unpack(final int v) {
    final int[] r = new int[mN];
    for (int k = 0, u = v; k < r.length; ++k, u /= cycleLength()) {
      r[k] = u % cycleLength();
    }
    return r;
  }

  private int pack(final int[] v) {
    int r = 0;
    for (int k = v.length - 1; k >= 0; --k) {
      r *= cycleLength();
      r += v[k];
    }
    return r;
  }

  private Graph torusGraph(final int n) {
    final int m = Z.valueOf(cycleLength()).pow(n).intValueExact();
    final Graph g = GraphFactory.create(m);
    if (n == 0) {
      g.addEdge(0, 0);
    } else {
      for (int u = 0; u < g.order(); ++u) {
        final int[] v = unpack(u);
        for (int k = 0; k < v.length; ++k) {
          final int t = v[k];
          v[k] = (t + 1) % cycleLength();
          g.addEdge(u, pack(v));
          v[k] = t;
        }
      }
    }
    return g;
  }

  @Override
  public Z next() {
    return Z.valueOf(CountIndependentSets.count(torusGraph(++mN)));
  }
}
