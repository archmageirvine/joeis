package irvine.math.graph;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

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
  public static Graph deBruijn2(final int n) {
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

  /**
   * Unpack a number.
   * @param v number
   * @param n base
   * @param q number of digits
   * @return unpacked form
   */
  public static int[] unpack(final int v, final int n, final int q) {
    final int[] r = new int[n];
    for (int k = 0, u = v; k < r.length; ++k, u /= q) {
      r[k] = u % q;
    }
    return r;
  }

  /**
   * Pack a number.
   * @param v unpacked form
   * @param q based
   * @return packed form
   */
  public static int pack(final int[] v, final int q) {
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

  /**
   * Return the graph <code>P(r)^n</code>.
   * @param r number of vertices in path
   * @param n power
   * @return path power graph
   */
  public static Graph pathPowerGraph(final int r, final int n) {
    final int m = Z.valueOf(r).pow(n).intValueExact();
    final Graph g = create(m);
    if (n > 0) {
      for (int u = 0; u < g.order(); ++u) {
        final int[] v = unpack(u, n, r);
        for (int k = 0; k < v.length; ++k) {
          if (v[k] != 0 && v[k] != r - 1) {
            --v[k];
            g.addEdge(u, pack(v, r));
            v[k] += 2;
            g.addEdge(u, pack(v, r));
            --v[k];
          } else if (r == 2 && v[k] == 0) {
            ++v[k];
            g.addEdge(u, pack(v, r));
            --v[k];
          }
        }
      }
    }
    return g;
  }

  private static int queenPack(final int n, final int[] k) {
    int vertex = 0;
    for (final int v : k) {
      vertex *= n;
      vertex += v;
    }
    return vertex;
  }

  private static boolean queenOk(final int n, final int[] k) {
    for (final int v : k) {
      if (v < 0 || v >= n) {
        return false;
      }
    }
    return true;
  }

  /**
   * Construct the queen's graph of given size and number of dimensions.
   * @param dimensions dimensions of space
   * @param n number of cells
   * @return queen's graph
   */
  public static Graph queens(final int dimensions, final int n) {
    if (dimensions < 1 || n < 0) {
      throw new IllegalArgumentException();
    }
    final Z nodes = Z.valueOf(n).pow(dimensions);
    if (nodes.bitLength() >= Integer.SIZE - 1) {
      throw new UnsupportedOperationException();
    }
    final Bumper bumper = BumperFactory.range(0, n - 1);
    final Bumper signBumper = BumperFactory.range(-1, 1);
    final Graph g = create(nodes.intValueExact());
    //System.out.println(g.order() + " vertices");
    final int[] k = new int[dimensions]; // nodes
    final int[] delta = new int[dimensions]; // directions the queen can move
    final int[] w = new int[dimensions]; // work
    do {
      final int v = queenPack(n, k);
      //System.out.println(v + " " + Arrays.toString(k));
      Arrays.fill(delta, -1);
      do {
        if (!IntegerUtils.isZero(delta)) {
          System.arraycopy(k, 0, w, 0, k.length);
          while (true) {
            for (int j = 0; j < w.length; ++j) {
              w[j] += delta[j];
            }
            if (!queenOk(n, w)) {
              break;
            }
            final int u = queenPack(n, w);
            g.addEdge(v, u);
          }
        }
      } while (signBumper.bump(delta));
    } while (bumper.bump(k));
    return g;
  }

  /**
   * Construct the king's graph of given order
   * @param order number of rows (or columns)
   * @return king's graph
   */
  public static Graph kings(final int order) {
    final Graph g = GraphFactory.create(order * order);
    for (int row = 0; row < order; ++row) {
      for (int col = 0; col < order; ++col) {
        final int v = row * order + col;
        // Add edges to neighbors (horizontal, vertical, diagonal)
        for (int dr = -1; dr <= 1; ++dr) {
          for (int dc = -1; dc <= 1; ++dc) {
            if (dr == 0 && dc == 0) {
              continue; // Skip the vertex itself
            }
            final int newRow = row + dr;
            final int newCol = col + dc;
            if (newRow >= 0 && newRow < order && newCol >= 0 && newCol < order) {
              g.addEdge(v, newRow * order + newCol);
            }
          }
        }
      }
    }
    return g;
  }

  /**
   * Construct the generalized Petersen graph with 2n vertices and "skip" m.
   * See <a href="https://mathworld.wolfram.com/GeneralizedPetersenGraph.html">Generalized Petersen Graph</a>
   * @param n order
   * @param m skip
   * @return Petersen graph
   */
  public static Graph petersen(final int n, final int m) {
    if (m < 1 || m > (n - 1) / 2) {
      throw new IllegalArgumentException("m must be in range 1.." + (n - 1) / 2);
    }
    final Graph g = GraphFactory.create(2 * n);
    for (int k = 0; k < n; ++k) {
      g.addEdge(k, (k + 1) % n); // outer cycle
      g.addEdge(k, k + n); // links from outer to inner
      g.addEdge(k + n, (k + m) % n + n); // inner cycle(s)
    }
    return g;
  }
}
