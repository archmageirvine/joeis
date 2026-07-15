package irvine.oeis.a085;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085576 Array read by antidiagonals: T(n,k) = size of largest subset of nodes in n X k grid such that there at least 3 edges between any pair of nodes (n &gt;= 1, k &gt;= 1).
 * @author Sean A. Irvine
 */
public class A085576 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  private void block(final Graph g, final long[] forbidden, final int u) {
    for (int w = g.nextVertex(u, u); w >= 0; w = g.nextVertex(u, w)) {
      ++forbidden[w];
      for (int x = g.nextVertex(w, u); x >= 0; x = g.nextVertex(w, x)) {
        ++forbidden[x];
      }
    }
  }

  private void clear(final Graph g, final long[] forbidden, final int u) {
    for (int w = g.nextVertex(u, u); w >= 0; w = g.nextVertex(u, w)) {
      --forbidden[w];
      for (int x = g.nextVertex(w, u); x >= 0; x = g.nextVertex(w, x)) {
        --forbidden[x];
      }
    }
  }

  private long t(final Graph g, final int v, final long[] forbidden, final long cnt) {
    long c = cnt;
    for (int u = v + 1; u < g.order(); ++u) {
      if (forbidden[u] == 0) {
        block(g, forbidden, u);
        c = Math.max(c, t(g, u, forbidden, cnt + 1));
        clear(g, forbidden, u);
      }
    }
    return c;
  }

  protected long t(final int n, final int m) {
    final Graph g = GraphFactory.grid(n, m);
    long cnt = 0;
    final long[] forbidden = new long[g.order()];
    // By symmetry, we can restrict the first vertex to the first quadrant
    for (int x = 0; x <= n / 2; ++x) {
      for (int y = 0; y <= m / 2; ++y) {
        final int v = x * m + y; // Note: depends on the details of GraphFactory.grid(n, m)
        block(g, forbidden, v);
        cnt = Math.max(cnt, t(g, v, forbidden, 1));
        clear(g, forbidden, v);
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(t(mN - mM + 1, mM + 1));
  }
}
