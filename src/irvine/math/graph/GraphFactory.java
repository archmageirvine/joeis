package irvine.math.graph;

import irvine.math.z.Z;

/**
 * Factory for the creation of graph objects.
 * @author Sean A. Irvine
 */
public final class GraphFactory {

  private GraphFactory() { }

  /**
   * Create a sparse graph.
   * @param order order of the graph
   * @return graph
   */
  public static Graph createSparse(final int order) {
    return new SparseGraph(order);
  }

  /**
   * Create a graph.
   * @param order order of the graph
   * @return graph
   */
  public static Graph create(final int order) {
    if (order <= 64) {
      return new SmallGraph(order);
    }
    return createSparse(order);
  }

  /**
   * Create a directed graph.
   * @param order order of the digraph
   * @return digraph
   */
  public static Graph createDigraph(final int order) {
    if (order <= 64) {
      return new SmallDigraph(order);
    }
    throw new UnsupportedOperationException();
  }

  /**
   * Convert directly from nauty style graph into a small graph.  Hopefully this
   * can eventually be deprecated.
   * @param order order of graph
   * @param adj adjacency matrix
   * @return the graph
   */
  public static Graph create(final int order, final long[] adj) {
    if (order <= 64) {
      return new SmallGraph(order, adj);
    }
    throw new UnsupportedOperationException();
  }

  /**
   * Construct the complete graph of specified order.
   * @param order number of vertices
   * @return complete graph
   */
  public static Graph complete(final int order) {
    final Graph g = create(order);
    for (int u = 1; u < order; ++u) {
      for (int v = 0; v < u; ++v) {
        g.addEdge(u, v);
      }
    }
    return g;
  }

  /**
   * Create the order 2 de Bruijn graph of given length
   * @param n length
   * @return de Bruijn graph
   */
  public static Graph createDeBruijn2(final int n) {
    if (n < 1 || n > 6) {
      throw new UnsupportedOperationException();
    }
    final int vertices = 1 << n;
    final int mask = vertices - 1;
    final Graph g = create(vertices);
    for (int v = 0; v < vertices; ++v) {
      final int shift = (v << 1) & mask;
      g.addEdge(v, shift);
      g.addEdge(v, shift | 1);
    }
    return g;
  }

  /**
   * Construct a Steinhaus graph on <code>n</code> vertices with first row
   * adjacencies given by <code>seed</code>.
   * @param n number of vertices
   * @param seed first row
   * @return Steinhaus graph
   */
  public static Graph steinhaus(final int n, long seed) {
    if (n > 64) {
      throw new UnsupportedOperationException();
    }
    if (seed > 1L << (n - 1)) {
      throw new IllegalArgumentException();
    }
    final Graph g = create(n);
    // Fill in initial row
    for (int u = n - 1; seed != 0; --u, seed >>>= 1) {
      if ((seed & 1) == 1) {
        g.addEdge(0, u);
      }
    }
    // Fill in mRemainder
    for (int u = 1; u < n; ++u) {
      for (int v = u + 1; v < n; ++v) {
        if (g.isAdjacent(u - 1, v - 1) ^ g.isAdjacent(u - 1, v)) {
          g.addEdge(u, v);
        }
      }
    }
    return g;
  }

  /**
   * Construct the hypercube of given dimension.
   * @param n dimension
   * @return <code>Q_n</code>, the hypercube of dimension n
   */
  public static Graph hypercube(final int n) {
    if (n > 31) {
      throw new UnsupportedOperationException();
    }
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    final Graph g = create(1 << n);
    if (n > 0) {
      for (int u = 0; u < g.order(); ++u) {
        for (int bit = 1; bit < g.order(); bit <<= 1) {
          g.addEdge(u, u ^ bit);
        }
      }
    }
    return g;
  }

  private static int[] unpack(final int v, final int n, final int q) {
    final int[] r = new int[n];
    for (int k = 0, u = v; k < r.length; ++k, u /= q) {
      r[k] = u % q;
    }
    return r;
  }

  private static int pack(final int[] v, final int q) {
    int r = 0;
    for (int k = v.length - 1; k >= 0; --k) {
      r *= q;
      r += v[k];
    }
    return r;
  }

  /**
   * Construct the Hamming graph of given dimension and complete size.
   * @param n dimension
   * @param q complete size
   * @return <code>Q_n</code>, the hypercube of dimension n
   */
  public static Graph hamming(final int n, final int q) {
    if (q == 2) {
      return hypercube(n); // special case (faster)
    }
    if (n > 31) {
      throw new UnsupportedOperationException();
    }
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    final int m = Z.valueOf(q).pow(n).intValueExact();
    final Graph g = GraphFactory.create(m);
    if (n > 0) {
      for (int u = 0; u < g.order(); ++u) {
        final int[] v = unpack(u, n, q);
        for (int k = 0; k < v.length; ++k) {
          final int t = v[k];
          for (int j = t + 1; j < q; ++j) {
            v[k] = j;
            g.addEdge(u, pack(v, q));
          }
          v[k] = t;
        }
      }
    }
    return g;
  }

}
