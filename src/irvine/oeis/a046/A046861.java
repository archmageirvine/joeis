package irvine.oeis.a046;

import irvine.graph.Graph;
import irvine.graph.Vertex;
import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046861 Lower members of a "good pair" of the form (k, 2*k +- 1).
 * @author Sean A. Irvine
 */
public class A046861 implements Sequence {

  private int mN = 0;

  private boolean isPotentiallyGood(final int n, final int m) {
    int j = 1;
    // de Bruijn, condition (2)
    while (j < n) {
      if (n % (j + 1) == 0) {
        return false;
      }
      j <<= 1;
    }
    j = 1;
    while (j < m) {
      if (m % (j + 1) == 0) {
        return false;
      }
      j <<= 1;
    }
    //System.out.println("Testing: n=" + n + " m=" + m + " (2 OK)");
    // de Bruijn, condition (4)
    if (n % 6 != m % 6) {
      return false;
    }
    //System.out.println("Testing: n=" + n + " m=" + m + " (4 OK)");
    // de Bruijn, condition (5)
    if (IntegerUtils.gcd(m, n) != 1) {
      return false;
    }
    //System.out.println("Testing: n=" + n + " m=" + m + " (5 OK)");
    // de Bruijn, condition (6)
    int k = 0;
    while (true) {
      final int low = ((1 << (2 * k + 1)) + 2) / 3;
      if (m * low > n) {
        return true;
      }
      final int high = 3 * (1 << (2 * k - 1));
      if (n <= m * high) {
        return false;
      }
      ++k;
    }
  }

  private Vertex<Integer, Integer> getOrCreateVertex(final Graph<Integer, Integer> g, final int n) {
    final Vertex<Integer, Integer> v = g.getVertex(n);
    if (v != null) {
      return v;
    }
    return g.addVertex(n);
  }

  private void addEdge(final Graph<Integer, Integer> graph, final int u, final int v) {
    if (u == 0 && v == 0) {
      return; // avoid adding loop at 0
    }
    final Vertex<Integer, Integer> x = getOrCreateVertex(graph, u);
    final Vertex<Integer, Integer> y = getOrCreateVertex(graph, v);
    graph.addDirectedEdge(x, y, null);
  }

  private boolean graphTest(final int n, final int m) {
    final int top = 2 * n / 3;
    final Graph<Integer, Integer> graph = new Graph<>();
    final int low = -m / 3;
    for (int k = low; k <= top; ++k) {
      if (k % 4 == 0) {
        addEdge(graph, k, k / 4);
      } else if ((k - m) % 4 == 0) {
        addEdge(graph, k, (k - m) / 4);
      } else if (((k + 2 * n) % 4) == 0) {
        addEdge(graph, k, (k + 2 * n) / 4);
      } else if (((k + 2 * n - m) % 4) == 0) {
        addEdge(graph, k, (k + 2 * n - m) / 4);
      }
    }
    return graph.isConnected();
  }

  protected Z select(final int n, final int m) {
    return Z.valueOf(n);
  }

  @Override
  public Z next() {
    while (true) {
      if (isPotentiallyGood(++mN, 2 * mN - 1) && graphTest(mN, 2 * mN - 1)) {
        return select(mN, 2 * mN - 1);
      }
      if (isPotentiallyGood(mN, 2 * mN + 1) && graphTest(mN, 2 * mN + 1)) {
        return select(mN, 2 * mN + 1);
      }
    }
  }
}
