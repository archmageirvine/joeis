package irvine.oeis.a000;

import irvine.graph.Graph;
import irvine.graph.Vertex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000696 Numbers n such that (1,n) is "good".
 * @author Sean A. Irvine
 */
public class A000696 implements Sequence {

  private int mN = 0;

  private int isGood(final int n) {
    // Test "good"ness of (1, n).  Performs some quick tests that avoid
    // need to consider the graph in many cases.  Return 1 for definitely
    // good, 0 for definitely not good, and -1 if unresolved by these
    // conditions.
    int j = 1;
    // de Bruijn, condition (2)
    while (j < mN) {
      if (n % (j + 1) == 0) {
        return 0;
      }
      j <<= 1;
    }
    // de Bruijn, condition (3)
    if ((n & (n + 1)) == 0) {
      // n has form 2^k-1, need to check power
      int m = n + 1;
      int v = 0;
      while (m != 0) {
        ++v;
        m >>>= 1;
      }
      if ((v & 1) == 0) {
        return 1;
      }
    }
    // de Bruijn, condition (4)
    if (n % 6 != 1) {
      return 0;
    }
    // de Bruijn, condition (5), is trivially true for us
    // de Bruijn, condition (6)
    int k = 0;
    while (true) {
      final int low = ((1 << (2 * k + 1)) + 2) / 3;
      if (low > n) {
        return -1;
      }
      final int high = 3 * (1 << (2 * k - 1));
      if (n <= high) {
        return 0;
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

  private boolean graphTest(final int n) {
    final int top = 2 * n / 3;
    final Graph<Integer, Integer> graph = new Graph<>();
    for (int k = 0; k <= top; ++k) {
      final Vertex<Integer, Integer> x = getOrCreateVertex(graph, k);
      if ((k & 3) <= 1) {
        final Vertex<Integer, Integer> x1 = getOrCreateVertex(graph, k >>> 2);
        graph.addDirectedEdge(x, x1, null);
      } else if (((k + 2 * n) & 3) <= 1) {
        final Vertex<Integer, Integer> x1 = getOrCreateVertex(graph, (k + 2 * n) >>> 2);
        graph.addDirectedEdge(x, x1, null);
      }
    }
    // I'm not convinced the first condition below is actually necessary
    return graph.order() == top + 1 && graph.isConnected();
  }

  @Override
  public Z next() {
    while (true) {
      final int good = isGood(++mN);
      if (good > 0 || (good < 0 && graphTest(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
