package irvine.math.graph;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

import irvine.math.IntegerUtils;
import irvine.math.Mobius;
import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.nauty.Nauty;
import irvine.math.nauty.OptionBlk;
import irvine.math.nauty.StatsBlk;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.PairMultiply;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.r.Constants;
import irvine.math.r.DoubleUtils;
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

  /**
   * Compute the cutting-number of the specified vertex in a graph.
   * @param graph the graph
   * @param vertex the vertex
   * @return cutting-number
   */
  public static int cuttingNumber(final Graph graph, final int vertex) {
    final Collection<Graph> branches = graph.delete(vertex).components();
    if (branches.size() <= 1) {
      return 0;
    }
    final int p = graph.order();
    int cn = (p - 1) * (p - 2) / 2;
    for (final Graph g : branches) {
      final int pg = g.order();
      cn -= pg * (pg - 1) / 2;
    }
    return cn;
  }

  /**
   * Compute the cutting-number of a graph.
   * @param graph the graph
   * @return cutting-number
   */
  public static int cuttingNumber(final Graph graph) {
    int cn = 0;
    for (int v = 0; v < graph.order(); ++v) {
      if (graph.degree(v) > 1) {
        final int cnv = cuttingNumber(graph, v);
        if (cnv > cn) {
          cn = cnv;
        }
      }
    }
    return cn;
  }

  private static int postorder(final Graph graph, final int[] el, final int[] pa, final boolean[] visited, final int v, final int parent, int k) {
    visited[v] = true;
    el[--k] = v;
    if (v != parent) {
      pa[k] = parent;
    }
    int u = -1;
    while ((u = graph.nextVertex(v, u)) >= 0) {
      if (!visited[u]) {
        k = postorder(graph, el, pa, visited, u, v, k);
      }
    }
    return k;
  }

  /**
   * Compute the cutting-number of a tree.  Note this is likely faster than computing
   * the cutting-number of a general graph. Behaviour is undefined if the input is not
   * a tree.
   * @param tree the tree
   * @return cutting-number
   */
  public static int cuttingNumberOfTree(final Graph tree) {
    // Compute cutting number of tree using Harary, Slater

    // Create a post ordering of the nodes in the tree
    final int p = tree.order();
    final int[] el = new int[p];
    final int[] pa = new int[p - 1];
    final int k = postorder(tree, el, pa, new boolean[el.length], 0, 0, p);
    assert k == 0;

    // Cutting numbers
    final int[] c = new int[p];
    final int[] d = new int[p];
    for (int i = 0; i < pa.length; ++i) {
      d[pa[i]] += d[el[i]] + 1;
      c[pa[i]] += (d[el[i]] + 1) * (p - 2 - d[el[i]]);
      c[el[i]] += (p - 1 - d[el[i]]) * d[el[i]];
    }
    return IntegerUtils.max(c) / 2;
  }

  /**
   * Test if a graph is vertex transitive.
   * @param graph graph to test
   * @return true iff the graph is vertex transitive
   */
  public static boolean isTransitive(final Graph graph) {
    final StatsBlk mNautyStats = new StatsBlk();
    final int[] orbits = new int[graph.order()];
    try {
      new Nauty(graph, new int[graph.order()], new int[graph.order()], null, orbits, new OptionBlk(), mNautyStats, new long[50]);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    return IntegerUtils.isZero(orbits);
  }

  private static final int[] ORDER4 = {0, 2, 1, 3};

  private static int node(final int order, final int u) {
    // Aesthetic correction for order == 4 graphs
    if (order == 4) {
      return ORDER4[u];
    }
    return u;
  }

  /**
   * Return an unlabelled dot graph representation of a graph.
   * Uses fixed node positions obeyed by <code>neato</code>.
   * @param graph graph to convert to dot format
   * @return string
   */
  public static String toDot(final Graph graph) {
    final int n = graph.order();
    if (n == 0) {
      return "graph G {\n}\n";
    }
    if (n == 1) {
      return "graph G {\n  0 [shape=point];\n}\n";
    }
    final double alpha = Constants.TAU / n;
    double theta = (n & 1) == 1 ? 0 : Math.PI / n;
    final double r = 0.25 / (2 * Math.sin(0.5 * alpha));
    final StringBuilder sb = new StringBuilder();
    sb.append("graph G {\n");
    sb.append("  node [shape=point];\n");
    // Position nodes
    for (int k = 0; k < n; ++k, theta += alpha) {
      sb.append("  ").append(k).append(" [pos=\"")
        .append(DoubleUtils.NF3.format(r * Math.sin(theta)))
        .append(',')
        .append(DoubleUtils.NF3.format(r * Math.cos(theta)))
        .append("!\"];\n");
    }
    // Add edges
    for (int u = 0; u < n; ++u) {
      for (int v = graph.nextVertex(u, u); v >= 0; v = graph.nextVertex(u, v)) {
        sb.append("  ").append(node(n, u)).append("--").append(node(n, v)).append(";\n");
      }
    }
    sb.append("}\n");
    return sb.toString();
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>("y", Rationals.SINGLETON);

  private static final ArrayList<Polynomial<Q>> CACHED_GEN_FUNC = new ArrayList<>();
  static {
    CACHED_GEN_FUNC.add(RING.zero());
  }

  private static Polynomial<Q> gy(final int n) {
    while (n >= CACHED_GEN_FUNC.size()) {
      final int m = CACHED_GEN_FUNC.size();
      final CycleIndex zm = SymmetricGroup.create(m).cycleIndex();
      final CycleIndex z = zm.op(PairMultiply.OP, zm);
      CACHED_GEN_FUNC.add(z.applyOnePlusXToTheN());
    }
    return CACHED_GEN_FUNC.get(n);
  }

  /**
   * Return the number of simple graphs with a given number of vertices and edges.
   * @param vertices number of vertices
   * @param edges number of edges
   * @return number of graphs
   */
  public static Z numberUnlabelledGraphs(final int vertices, final int edges) {
    return gy(vertices).coeff(edges).toZ();
  }

  private static final PolynomialRingField<Polynomial<Q>> RING2 = new PolynomialRingField<>(RING);

  private static Polynomial<Polynomial<Q>> gfUnlabelledConnectedGraphs(final int n) {
    // Effectively a kind of inverse Euler transform on the general case
    final ArrayList<Polynomial<Q>> g = new ArrayList<>();
    for (int k = 1; k <= n; ++k) {
      g.add(gy(k));
    }
    final Polynomial<Polynomial<Q>> p = RING2.log1p(RING2.create(g).shift(1), n);
    Polynomial<Polynomial<Q>> sum = RING2.zero();
    for (int k = 1; k <= n; ++k) {
      final int mobius = Mobius.mobius(k);
      if (mobius != 0) {
        final Polynomial<Polynomial<Q>> t = p.substitutePower(k, n);
        final Polynomial<Polynomial<Q>> u = RING2.empty();
        for (final Polynomial<Q> v : t) {
          u.add(RING.divide(v.substitutePower(k, n), new Q(k)));
        }
        sum = RING2.signedAdd(mobius == 1, sum, u);
      }
    }
    return sum;
  }

  private static Polynomial<Polynomial<Q>> sUnlabelledConnectedGraphs = RING2.zero();

  /**
   * Return the number of simple connected graphs with a given number of vertices and edges.
   * @param vertices number of vertices
   * @param edges number of edges
   * @return number of graphs
   */
  public static Z numberUnlabelledConnectedGraphs(final int vertices, final int edges) {
    if (vertices > sUnlabelledConnectedGraphs.degree()) {
      sUnlabelledConnectedGraphs = gfUnlabelledConnectedGraphs(vertices);
    }
    return sUnlabelledConnectedGraphs.coeff(vertices).coeff(edges).toZ();
//
//    // Direct enumeration with nauty
//    return new ParallelGenerateGraphsSequence(vertices - 1, 0, false, false, false) {
//      @Override
//      protected long getCount(final Graph graph) {
//        return 1;
//      }
//
//      @Override
//      protected void graphGenInit(final GenerateGraphs gg) {
//        gg.setVertices(vertices);
//        gg.setMinEdges(edges);
//        gg.setMaxEdges(edges);
//        gg.setConnectionLevel(1);
//      }
//    }.next();
  }
}
