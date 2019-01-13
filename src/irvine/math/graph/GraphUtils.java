package irvine.math.graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * Various graph counting functions.
 * @author Sean A. Irvine
 */
public final class GraphUtils {

  private GraphUtils() {
  }

  private static final HashMap<Pair<Long, Long>, Z> NUMBER_LABELLED_COLOURED_CACHE = new HashMap<>();

  /**
   * The number of graphs with {@code nodes} labelled nodes, each node being
   * coloured with one of {@code colours} colours such that no two adjacent
   * nodes have the same colour.
   * @param nodes number of nodes
   * @param colours number of colours
   * @return number of graphs
   */
  public static Z numberLabelledColoured(final long nodes, final long colours) {
    if (nodes < 0 || colours < 0) {
      throw new IllegalArgumentException();
    }
    if (nodes == 0) {
      return Z.ONE;
    }
    if (colours == 0) {
      return Z.ZERO;
    }
    final Pair<Long, Long> key = new Pair<>(nodes, colours);
    final Z r = NUMBER_LABELLED_COLOURED_CACHE.get(key);
    if (r != null) {
      return r;
    }
    Z s = Z.ZERO;
    for (long k = 0; k <= nodes; ++k) {
      final long power = k * (nodes - k);
      if (power > Integer.MAX_VALUE) {
        throw new UnsupportedOperationException();
      }
      s = s.add(Binomial.binomial(nodes, k).multiply(numberLabelledColoured(k, colours - 1)).shiftLeft((int) power));
    }
    NUMBER_LABELLED_COLOURED_CACHE.put(key, s);
    return s;
  }


  private static final HashMap<Pair<Long, Long>, Z> NUMBER_CONNECTED_LABELLED_COLOURED_CACHE = new HashMap<>();

  /**
   * The number of connected graphs with {@code nodes} labelled nodes, each node being
   * coloured with one of {@code colours} colours such that no two adjacent
   * nodes have the same colour.
   * @param nodes number of nodes
   * @param colours number of colours
   * @return number of graphs
   */
  public static Z numberConnectedLabelledColoured(final long nodes, final long colours) {
    if (nodes < 0 || colours <= 0) {
      throw new IllegalArgumentException();
    }
    if (nodes == 0) {
      return Z.ONE;
    }
    if (colours == 1) {
      return nodes == 1 ? Z.ONE : Z.ZERO;
    }
    if (nodes == 1) {
      return Z.valueOf(colours);
    }
    final Pair<Long, Long> key = new Pair<>(nodes, colours);
    final Z r = NUMBER_CONNECTED_LABELLED_COLOURED_CACHE.get(key);
    if (r != null) {
      return r;
    }
    Z s = numberLabelledColoured(nodes, colours);
    for (long k = 1; k < nodes; ++k) {
      s = s.subtract(Binomial.binomial(nodes - 1, k - 1).multiply(numberConnectedLabelledColoured(k, colours)).multiply(numberLabelledColoured(nodes - k, colours)));
    }
    NUMBER_CONNECTED_LABELLED_COLOURED_CACHE.put(key, s);
    return s;
  }

  private static boolean isKConnected(final Graph g, final int k, final int v) {
    if (k <= 2) {
      if (k == 0) {
        return true;
      }
      if (k == 1) {
        return g.isConnected();
      }
      return g.isBiconnected();
    }
    // Choose a vertex to delete and recurse on smaller graph and smaller connectivity
    for (int u = v; u < g.order(); ++u) {
      if (!isKConnected(g.delete(u), k - 1, u)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Test if the given graph is k-connected.
   * @param g the graph
   * @param k connectivity to test.
   * @return true iff the graph is k-connected
   */
  public static boolean isKConnected(final Graph g, final int k) {
    return isKConnected(g, k, 0);
  }

  /**
   * Test if the graph is k-Hamiltonian.
   * @param g graph to test
   * @param k number of vertices to be deleted
   * @return true iff the graph is k-Hamiltonian
   */
  public static boolean isKHamiltonian(final Graph g, final int k) {
    if (k == 0) {
      return g.isHamiltonian();
    } else {
      for (int u = 0; u < g.order(); ++u) {
        if (!isKHamiltonian(g.delete(u), k - 1)) {
          return false;
        }
      }
      return true;
    }
  }

  /**
   * Test if the graph is 1-tough.
   * @param g graph to test
   * @return true if the graph is 1-tough
   */
  public static boolean isOneTough(final Graph g) {
    if (!g.isBiconnected()) {
      return false; // All 1-tough graphs are biconnected
    }
    // Test for 1-toughness, delete every combination of vertices
    // This is probably a slow implementation, but we do it for a comparatively small number of graphs
    final long limit = (1L << g.order()) - 1;
    for (long toDelete = 1; toDelete < limit; ++toDelete) {
      long d = toDelete;
      Graph tough = g;
      int k = 0;
      while (d != 0) {
        if ((d & 1) == 1) {
          tough = tough.delete(k); // Don't advance k in this case
        } else {
          ++k;
        }
        d >>>= 1;
      }
      if (tough.numberOfComponents() > Long.bitCount(toDelete)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Test if the graph is bipartite.
   * @param g the graph
   * @return true iff the graph is bipartite
   */
  public static boolean isBipartite(final Graph g) {
    final int n = g.order();
    if (n == 0) {
      return true;
    }
    // Handle loops
    for (int u = 0; u < n; ++u) {
      if (g.isAdjacent(u, u)) {
        return false;
      }
    }
    final int[] color = new int[n];
    Arrays.fill(color, -1);

    final LinkedList<Integer> q = new LinkedList<>();
    for (int t = 0; t < n; ++t) {
      if (color[t] == -1) {
        color[t] = 1;
        q.add(t);
        while (!q.isEmpty()) {
          final int u = q.poll();
          final int cu = color[u];
          int v = -1;
          while ((v = g.nextVertex(u, v)) >= 0) {
            final int cv = color[v];
            if (cv == cu) {
              return false;
            }
            if (cv == -1) {
              color[v] = 1 - cu;
              q.add(v);
            }
          }
        }
      }
    }
    return true;
  }
}
