package irvine.math.graph;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;

import irvine.graph.Vertex;
import irvine.math.IntegerUtils;
import irvine.math.Mobius;
import irvine.math.api.Field;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.MatrixRing;
import irvine.math.group.PolynomialRing;
import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.nauty.Nauty;
import irvine.math.nauty.OptionBlk;
import irvine.math.nauty.StatsBlk;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.PairMultiply;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.r.Constants;
import irvine.math.r.DoubleUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
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
      s = s.add(Binomial.binomial(nodes, k).multiply(numberLabelledColoured(k, colours - 1)).shiftLeft(power));
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

  /**
   * Compute the number of spanning trees in a graph.
   * @param graph the graph
   * @return number of spanning trees
   */
  public static Z numberOfSpanningTrees(final Graph graph) {
    // Kirchhoff's Theorem
    final int n = graph.order();
    // Matrix has one less dimension than graph
    final DefaultMatrix<Z> matrix = new DefaultMatrix<>(n - 1, n - 1, Z.ZERO);
    for (int k = 0; k < n - 1; ++k) {
      matrix.set(k, k, Z.valueOf(graph.degree(k)));
      for (int j = 0; j < n - 1; ++j) {
        if (k != j && graph.isAdjacent(k, j)) {
          matrix.set(k, j, Z.NEG_ONE);
        }
      }
    }
    return new MatrixRing<>(n - 1, Integers.SINGLETON).det(matrix);
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
    new Nauty(graph, new int[graph.order()], new int[graph.order()], null, orbits, new OptionBlk(), mNautyStats, new long[50]);
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
          u.add(RING.divide(v.substitutePower(k), new Q(k)));
        }
        sum = RING2.signedAdd(mobius == 1, sum, u);
      }
    }
    return sum.truncate(n);
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

  /**
   * Return a packed representation of the neighbours of a given vertex.
   * Undefined for graphs with more than 64 vertices.
   * @param graph the graph
   * @param u vertex
   * @return packed neighbours
   */
  public static long neighbours(final Graph graph, final int u) {
    long neighbours = 0;
    for (int v = graph.nextVertex(u, -1); v >= 0; v = graph.nextVertex(u, v)) {
      neighbours |= 1L << v;
    }
    return neighbours;
  }

  /**
   * Test if the given graph is strongly regular.
   * @param graph graph to test
   * @return true iff the graph is strongly regular
   */
  public static boolean isStronglyRegular(final Graph graph) {
    if (graph.order() > 64) {
      throw new UnsupportedOperationException();
    }
    int r = -1;
    int a = -1;
    int b = -1;
    for (int u = 0; u < graph.order(); ++u) {
      final long nu = neighbours(graph, u);
      final int cu = Long.bitCount(nu);
      if (r == -1) {
        r = cu;
      } else if (r != cu) {
        return false; // graph is not even regular
      }
      for (int v = 0; v < u; ++v) {
        // u and v a pair of vertices
        final long nv = neighbours(graph, v);
        final int cnt = Long.bitCount(nu & nv);
        if (graph.isAdjacent(u, v)) {
          if (a == -1) {
            a = cnt;
          } else if (a != cnt) {
            return false;
          }
        } else {
          if (b == -1) {
            b = cnt;
          } else if (b != cnt) {
            return false;
          }
        }
      }
    }
    return true;
  }

  // Following functions based on corresponding Pari code by Andrew Howroyd

  /**
   * Compute cycle index data for graphs.
   * @param <E> type of underlying field
   * @param fld field for substitution function
   * @param n maximum order
   * @param edgeFunc edge function
   * @param yf substitution function
   * @return graph data
   */
  public static <E> List<List<E>> graphCycleIndexData(final Field<E> fld, final int n, final Edges edgeFunc, final Function<Integer, E> yf) {
    final List<List<E>> results = new ArrayList<>();
    for (int k = 0; k <= n; ++k) {
      final List<E> v = new ArrayList<>();
      final IntegerPartition part = new IntegerPartition(k);
      int[] p;
      while ((p = part.next()) != null) {
        v.add(fld.multiply(edgeFunc.edges(p, fld, yf), fld.coerce(IntegerPartition.permCount(p))));
      }
      results.add(v);
    }
    return results;
  }

  /**
   * Compute the inverse of the given graph cycle index data.
   * @param <E> underlying field
   * @param fld field for substitution function
   * @param blocks graph cycle index data
   * @param yf substitution function
   * @return inverse of cycle index data
   */
  public static <E> List<List<E>> invGgfCycleIndexData(final Field<E> fld, final List<List<E>> blocks, final Function<Integer, E> yf) {
    final List<List<E>> results = new ArrayList<>();
    results.add(Collections.singletonList(fld.one()));
    for (int n = 1; n < blocks.size(); ++n) {
      final Map<String, Integer> pm = IntegerPartition.buildPartitionIndex(n);
      final List<E> v = new ArrayList<>();
      for (int i = 1; i <= n; ++i) {
        final int j = n - i;
        final List<E> uj = results.get(j);
        final List<E> ui = blocks.get(i);
        final E b = fld.coerce(Binomial.binomial(n, i));
        int xj = -1;
        final IntegerPartition partj = new IntegerPartition(j);
        int[] pj;
        while ((pj = partj.next()) != null) {
          final List<E> q = new ArrayList<>();
          q.add(null); // 0 unused
          ++xj;
          for (int s = 1; s <= i; ++s) {
            E qs = fld.one();
            for (final int k : pj) {
              final int g = IntegerUtils.gcd(s, k);
              qs = fld.multiply(qs, fld.pow(yf.apply(s * k / g), g));
            }
            q.add(qs);
          }
          int xi = -1;
          final IntegerPartition parti = new IntegerPartition(i);
          int[] pi;
          while ((pi = parti.next()) != null) {
            ++xi;
            final int col = pm.get(Arrays.toString(IntegerPartition.merge(pi, pj)));
            E pr = fld.one();
            for (final int k : pi) {
              pr = fld.multiply(pr, q.get(k));
            }
            while (col >= v.size()) {
              v.add(fld.zero());
            }
            final E w = fld.multiply(fld.multiply(uj.get(xj), b), ui.get(xi));
            v.set(col, fld.subtract(v.get(col), fld.multiply(pr, w)));
          }
        }
      }
      results.add(v);
    }
    return results;
  }

  /**
   * Convert a cycle index series stored as a list of lists into an ordinary generation function
   * counting the unlabeled objects
   * @param fld underlying field
   * @param data cycle index series
   * @param <E> underlying field type
   * @return ordinary generation function
   */
  public static <E> Polynomial<E> unlabeledOgf(final Field<E> fld, final List<List<E>> data) {
    final PolynomialRingField<E> ring = new PolynomialRingField<>(fld);
    final Polynomial<E> res = ring.empty();
    Z f = Z.ONE;
    for (int n = 0; n < data.size(); f = f.multiply(++n)) {
      E sum = fld.zero();
      for (final E d : data.get(n)) {
        sum = fld.add(sum, d);
      }
      res.add(fld.divide(sum, fld.coerce(f)));
    }
    return res;
  }

  /**
   * Compute the log of the input in a power series sense.
   * @param fld underlying field
   * @param input cycle index data
   * @param <E> underlying field type
   * @return log
   */
  public static <E> List<List<E>> primLogCycleIndexData(final Field<E> fld, final List<List<E>> input) {
    final List<List<E>> results = new ArrayList<>();
    results.add(Collections.singletonList(fld.zero()));
    for (int n = 1; n < input.size(); ++n) {
      final List<E> v = new ArrayList<>(input.get(n));
      final Map<String, Integer> pm = IntegerPartition.buildPartitionIndex(n);
      for (int i = 1; i < n; ++i) {
        final int j = n - i;
        final List<E> uj = results.get(j);
        final List<E> ui = input.get(i);
        final E b = fld.coerce(Binomial.binomial(n - 1, i));
        int xj = -1;
        final IntegerPartition partJ = new IntegerPartition(j);
        int[] pj;
        while ((pj = partJ.next()) != null) {
          ++xj;
          int xi = -1;
          final IntegerPartition partI = new IntegerPartition(i);
          int[] pi;
          while ((pi = partI.next()) != null) {
            ++xi;
            final int col = pm.get(Arrays.toString(IntegerPartition.merge(pi, pj)));
            final E t = fld.multiply(fld.multiply(uj.get(xj), ui.get(xi)), b);
            v.set(col, fld.subtract(v.get(col), t));
          }
        }
      }
      results.add(v);
    }
    return results;
  }

  private static int[] scaleVSmall(final int[] v, final int m) {
    final int[] s = new int[v.length];
    for (int k = 0; k < v.length; ++k) {
      s[k] = v[k] * m;
    }
    return s;
  }

  /**
   * Compute the log of a cycle index in a combinatorial sense.
   * @param fld underlying field
   * @param input cycle index data
   * @param <E> underlying field type
   * @return log
   */
  public static <E> List<List<E>> logCycleIndexData(final Field<E> fld, final List<List<E>> input) {
    final List<List<E>> lg = primLogCycleIndexData(fld, input);
    final List<List<E>> results = new ArrayList<>();
    results.add(Collections.singletonList(fld.zero()));
    for (int n = 1; n < input.size(); ++n) {
      final List<E> v = new ArrayList<>();
      final Map<String, Integer> pm = IntegerPartition.buildPartitionIndex(n);
      for (int d = 1; d <= n; ++d) {
        if (n % d == 0) {
          final int i = n / d;
          final E r = fld.coerce(MemoryFactorial.SINGLETON.factorial(n).divide(MemoryFactorial.SINGLETON.factorial(i)).divide(d).multiply(Mobius.mobius(d)));
          final List<E> ui = lg.get(i);
          int xi = -1;
          final IntegerPartition partI = new IntegerPartition(n / d);
          int[] pi;
          while ((pi = partI.next()) != null) {
            ++xi;
            final int col = pm.get(Arrays.toString(scaleVSmall(pi, d)));
            final E subs = PolynomialUtils.deepSubstitute(fld, ui.get(xi), d);
            while (col >= v.size()) {
              v.add(fld.zero());
            }
            v.set(col, fld.add(v.get(col), fld.multiply(subs, r)));
          }
        }
      }
      results.add(v);
    }
    return results;
  }

  /**
   * Negate the given list of lists.
   * @param fld underlying field
   * @param data the data to negate
   * @param <E> element type
   * @return negated data
   */
  public static <E> List<List<E>> negate(final Field<E> fld, final List<List<E>> data) {
    final List<List<E>> res = new ArrayList<>();
    for (final List<E> lst : data) {
      final List<E> negation = new ArrayList<>();
      res.add(negation);
      for (final E l : lst) {
        negation.add(fld.negate(l));
      }
    }
    return res;
  }

  /**
   * Multiply cycle index data.
   * @param fld underlying field
   * @param lhs multiplicand
   * @param rhs multiplicand
   * @param <E> underlying field type
   * @return product
   */
  public static <E> List<List<E>> multiplyCycleIndexData(final Field<E> fld, final List<List<E>> lhs, final List<List<E>> rhs) {
    final List<List<E>> results = new ArrayList<>();
    for (int n = 0; n < Math.min(lhs.size(), rhs.size()); ++n) {
      final List<E> v = new ArrayList<>();
      final Map<String, Integer> pm = IntegerPartition.buildPartitionIndex(n);
      for (int i = 0; i <= n; ++i) {
        final int j = n - i;
        final List<E> uj = rhs.get(j);
        final List<E> ui = lhs.get(i);
        final E b = fld.coerce(Binomial.binomial(n, i));
        int xj = -1;
        final IntegerPartition partJ = new IntegerPartition(j);
        int[] pj;
        while ((pj = partJ.next()) != null) {
          ++xj;
          int xi = -1;
          final IntegerPartition partI = new IntegerPartition(i);
          int[] pi;
          while ((pi = partI.next()) != null) {
            ++xi;
            final int col = pm.get(Arrays.toString(IntegerPartition.merge(pi, pj)));
            while (col >= v.size()) {
              v.add(fld.zero());
            }
            v.set(col, fld.add(v.get(col), fld.multiply(fld.multiply(uj.get(xj), ui.get(xi)), b)));
          }
        }
      }
      results.add(v);
    }
    return results;
  }

  /**
   * Multiply cycle index data in a special way.
   * @param fld underlying field
   * @param lhs multiplicand
   * @param rhs multiplicand
   * @param yf function
   * @param <E> underlying field type
   * @return product
   */
  public static <E> List<List<E>> multiplyGgfCycleIndexData(final Field<E> fld, final List<List<E>> lhs, final List<List<E>> rhs, final Function<Integer, E> yf) {
    final List<List<E>> results = new ArrayList<>();
    for (int n = 0; n < Math.min(lhs.size(), rhs.size()); ++n) {
      final List<E> v = new ArrayList<>();
      final Map<String, Integer> pm = IntegerPartition.buildPartitionIndex(n);
      for (int i = 0; i <= n; ++i) {
        final int j = n - i;
        final List<E> uj = rhs.get(j);
        final List<E> ui = lhs.get(i);
        final E b = fld.coerce(Binomial.binomial(n, i));
        int xj = -1;
        final IntegerPartition partJ = new IntegerPartition(j);
        int[] pj;
        while ((pj = partJ.next()) != null) {
          final List<E> q = new ArrayList<>();
          ++xj;
          for (int s = 1; s <= i; ++s) {
            E prod = fld.one();
            for (final int t : pj) {
              final int g = IntegerUtils.gcd(s, t);
              prod = fld.multiply(prod, fld.pow(yf.apply(s * t / g), g));
            }
            q.add(prod);
          }
          int xi = -1;
          final IntegerPartition partI = new IntegerPartition(i);
          int[] pi;
          while ((pi = partI.next()) != null) {
            ++xi;
            final int col = pm.get(Arrays.toString(IntegerPartition.merge(pi, pj)));
            while (col >= v.size()) {
              v.add(fld.zero());
            }
            E prod = fld.one();
            for (final int t : pi) {
              prod = fld.multiply(prod, q.get(t - 1));
            }
            v.set(col, fld.add(v.get(col), fld.multiply(fld.multiply(fld.multiply(uj.get(xj), ui.get(xi)), b), prod)));
          }
        }
      }
      results.add(v);
    }
    return results;
  }

  private static final int[] ONE = {1};

  /**
   * Shift data up by one position, inserting a zero.
   * @param fld underlying field
   * @param data data to shift
   * @param <E> underlying field type
   * @return shifted data
   */
  public static <E> List<List<E>> shift(final Field<E> fld, final List<List<E>> data) {
    final List<List<E>> results = new ArrayList<>();
    results.add(Collections.singletonList(fld.zero()));
    for (int n = 1; n <= data.size(); ++n) {
      final Map<String, Integer> pm = IntegerPartition.buildPartitionIndex(n);
      final List<E> ui = data.get(n - 1);
      final List<E> v = new ArrayList<>();
      int xi = -1;
      final IntegerPartition partI = new IntegerPartition(n - 1);
      int[] pi;
      while ((pi = partI.next()) != null) {
        ++xi;
        final int col = pm.get(Arrays.toString(IntegerPartition.merge(ONE, pi)));
        while (col >= v.size()) {
          v.add(fld.zero());
        }
        v.set(col, fld.multiply(ui.get(xi), fld.coerce(n)));
      }
      results.add(v);
    }
    return results;
  }

  /**
   * Generating function for initially (or finally) connected graphs.
   * Formula: <code>D X S*exp(-S)</code>.
   * @param <E> underlying field type
   * @param fld underlying field
   * @param graphs graph data
   * @param yf field function
   * @return generating function
   */
  public static <E> Polynomial<E> initially(final Field<E> fld, final List<List<E>> graphs, final Function<Integer, E> yf) {
    final List<List<E>> tmp1 = invGgfCycleIndexData(fld, graphs, yf);
    final List<List<E>> tmp2 = negate(fld, logCycleIndexData(fld, tmp1));
    final List<List<E>> tmp3 = multiplyGgfCycleIndexData(fld, graphs, multiplyCycleIndexData(fld, tmp2, tmp1), yf);
    return unlabeledOgf(fld, tmp3);
  }

  /**
   * Generating function for initially (or finally) connected graphs with a global source (or sink).
   * Formula: <code>D X x*exp(-S)</code>.
   * @param <E> underlying field type
   * @param fld underlying field
   * @param graphs graph data
   * @param yf field function
   * @return generating function
   */
  public static <E> Polynomial<E> initiallyV(final Field<E> fld, final List<List<E>> graphs, final Function<Integer, E> yf) {
    final List<List<E>> tmp1 = invGgfCycleIndexData(fld, graphs, yf); // exp(-S)
    final List<List<E>> tmp2 = shift(fld, tmp1); // x * exp(-S)
    final List<List<E>> tmp3 = multiplyGgfCycleIndexData(fld, graphs, tmp2, yf);
    return unlabeledOgf(fld, tmp3);
  }

  /**
   * Generating function for initially-finally connected graphs.
   * Formula: <code>S - S^2 + exp(S) * ((S*exp(-S)) X (S*exp(-S)) X D)</code>.
   * @param fld underlying field
   * @param graphs graph data
   * @param yf field function
   * @param <E> underlying field type
   * @return generating function
   */
  public static <E> Polynomial<E> initiallyFinally(final Field<E> fld, final List<List<E>> graphs, final Function<Integer, E> yf) {
    final List<List<E>> tmp1 = invGgfCycleIndexData(fld, graphs, yf); // exp(-S)
    final List<List<E>> tmp2 = negate(fld, logCycleIndexData(fld, tmp1)); // S
    final List<List<E>> tmp3 = multiplyCycleIndexData(fld, tmp2, tmp1); // S*exp(-S)
    final List<List<E>> tmp4 = multiplyGgfCycleIndexData(fld, graphs, multiplyGgfCycleIndexData(fld, tmp3, tmp3, yf), yf);
    final Polynomial<E> sogf = unlabeledOgf(fld, tmp2);
    final DegreeLimitedPolynomialRingField<E> ring = new DegreeLimitedPolynomialRingField<>(fld, sogf.degree());
    final Polynomial<E> sogf2 = ring.multiply(sogf, sogf);
    final Polynomial<E> et = ring.multiply(PolynomialUtils.eulerTransform(fld, sogf), unlabeledOgf(fld, tmp4));
    return ring.add(ring.subtract(sogf, sogf2), et);
  }

  /**
   * Generating function for initially-finally connected graphs with a global source and sink.
   * Formula: <code>x - x^2 + exp(S) * ((x*exp(-S)) X (x*exp(-S)) X D)</code>.
   * @param fld underlying field
   * @param graphs graph data
   * @param yf field function
   * @param <E> underlying field type
   * @return generating function
   */
  public static <E> Polynomial<E> initiallyFinallyV(final Field<E> fld, final List<List<E>> graphs, final Function<Integer, E> yf) {
    final List<List<E>> tmp1 = invGgfCycleIndexData(fld, graphs, yf); // exp(-S)
    final List<List<E>> tmp2 = shift(fld, tmp1); // x*exp(-S)
    final List<List<E>> tmp3 = multiplyGgfCycleIndexData(fld, graphs, multiplyGgfCycleIndexData(fld, tmp2, tmp2, yf), yf);
    final Polynomial<E> sogf = new PolynomialRingField<>(fld).negate(PolynomialUtils.inverseEuler(fld, unlabeledOgf(fld, tmp1)));
    final DegreeLimitedPolynomialRingField<E> ring = new DegreeLimitedPolynomialRingField<>(fld, sogf.degree());
    final Polynomial<E> et = ring.multiply(PolynomialUtils.eulerTransform(fld, sogf), unlabeledOgf(fld, tmp3));
    return ring.add(ring.subtract(ring.x(), ring.x().shift(1)), et);
  }

  /**
   * Compute pointing cycle index data.
   * @param fld underlying field
   * @param data graph data
   * @param <E> underlying field type
   * @return pointing data
   */
  public static <E> List<List<E>> pointCycleIndexData(final Field<E> fld, final List<List<E>> data) {
    final List<List<E>> results = new ArrayList<>();
    for (int n = 0; n < data.size(); ++n) {
      final List<E> v = new ArrayList<>(data.get(n));
      int xi = -1;
      final IntegerPartition partN = new IntegerPartition(n);
      int[] pi;
      while ((pi = partN.next()) != null) {
        ++xi;
        v.set(xi, fld.multiply(v.get(xi), fld.coerce(IntegerUtils.count(1, pi))));
      }
      results.add(v);
    }
    return results;
  }

  /**
   * Generating function for strongly connected graphs.
   * @param fld underlying field
   * @param graphs graph data
   * @param yf underlying field function
   * @param <E> underlying field type
   * @return generating function
   */
  public static <E> Polynomial<E> stronglyConnected(final Field<E> fld, final List<List<E>> graphs, final Function<Integer, E> yf) {
    return new PolynomialRing<>(fld).negate(unlabeledOgf(fld, invGgfCycleIndexData(fld, graphs, yf)));
  }

  /**
   * Generating function for strong graphs.
   * @param fld underlying field
   * @param graphs graph data
   * @param yf underlying field function
   * @param <E> underlying field type
   * @return generating function
   */
  public static <E> Polynomial<E> strong(final Field<E> fld, final List<List<E>> graphs, final Function<Integer, E> yf) {
    return new PolynomialRing<>(fld).negate(PolynomialUtils.inverseEuler(fld, unlabeledOgf(fld, invGgfCycleIndexData(fld, graphs, yf))));
  }

  /**
   * Generating function for rooted strongly connected graphs.
   * @param fld underlying field
   * @param graphs graph data
   * @param yf underlying field function
   * @param <E> underlying field type
   * @return generating function
   */
  public static <E> Polynomial<E> rootedStronglyConnected(final Field<E> fld, final List<List<E>> graphs, final Function<Integer, E> yf) {
    return unlabeledOgf(fld, pointCycleIndexData(fld, negate(fld, logCycleIndexData(fld, invGgfCycleIndexData(fld, graphs, yf)))));
  }

  /**
   * Load a graph from an input stream, where the vertex labels are unique strings.
   * The file is assumed to consist of lines like <code>v1 op v2</code> representing
   * the edges of the graph. If <code>op</code> is <code>--</code> the edge is
   * undirected, otherwise <code>-&gt;</code> and <code>&lt;-</code> denoted directed
   * edges.
   * Blank lines and lines starting with <code>#</code> are ignored.
   * @param is input stream
   * @return graph
   * @exception IOException if an I/O error or malformed input is encountered.
   */
  public static irvine.graph.Graph<String, String> load(final InputStream is) throws IOException {
    final irvine.graph.Graph<String, String> g = new irvine.graph.Graph<>();
    final HashMap<String, Vertex<String, String>> map = new HashMap<>();
    try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
      String line;
      while ((line = br.readLine()) != null) {
        if (!line.isEmpty() && line.charAt(0) != '#') {
          final String[] parts = line.split("\\s+");
          if (parts.length != 3) {
            throw new IOException("Bad line: " + line);
          }
          final Vertex<String, String> left = map.computeIfAbsent(parts[0], g::addVertex);
          final Vertex<String, String> right = map.computeIfAbsent(parts[2], g::addVertex);
          final String op = parts[1];
          if ("--".equals(op)) {
            g.addEdge(left, right, null);
          } else if ("->".equals(op)) {
            g.addDirectedEdge(left, right, null);
          } else if ("<-".equals(op)) {
            g.addDirectedEdge(right, left, null);
          } else {
            throw new IOException("Bad line: " + line);
          }
        }
      }
    }
    return g;
  }

  /**
   * Load a graph from a file.  See documentation on <code>load(InputStream is)</code>
   * for details on graph format.
   * @param graphFile file containing the graph
   * @return graph
   * @exception IOException if an I/O error or malformed input is encountered.
   */
  public static irvine.graph.Graph<String, String> load(final File graphFile) throws IOException {
    return load(new FileInputStream(graphFile));
  }

  /**
   * Construct a graph with the specified number of vertices and no edges.
   * @param n number of vertices
   * @return empty graph on <code>n</code> vertices
   * @exception IllegalArgumentException if <code>n</code> is less than zero.
   */
  public static irvine.graph.Graph<Integer, String> empty(final int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    final irvine.graph.Graph<Integer, String> g = new irvine.graph.Graph<>();
    for (int k = 0; k < n; ++k) {
      g.addVertex(k);
    }
    return g;
  }

  /**
   * Construct the complete graph of given order.
   * @param n number of vertices
   * @return complete graph on <code>n</code> vertices
   * @exception IllegalArgumentException if <code>n</code> is less than zero.
   */
  public static irvine.graph.Graph<Integer, String> complete(final int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    final irvine.graph.Graph<Integer, String> g = new irvine.graph.Graph<>();
    for (int k = 0; k < n; ++k) {
      g.addVertex(k);
    }
    for (int k = 0; k < n; ++k) {
      for (int j = k + 1; j < n; ++j) {
        g.addEdge(g.getVertex(k), g.getVertex(j), null);
      }
    }
    return g;
  }

  /**
   * Return a new undirected graph of given order and size with randomly selected
   * edges. The resulting graph may be a multigraph and may contain loops.
   * @param order desired order of graph
   * @param size desired size of graph
   * @param seed random number seed
   * @return random undirected graph of given order and size
   * @exception IllegalArgumentException if either parameter is negative or if
   * the order is zero and the size positive.
   */
  public static irvine.graph.Graph<Integer, Integer> randomUndirected(final int order, final int size, final long seed) {
    if (order < 0 || size < 0) {
      throw new IllegalArgumentException();
    }
    if (order == 0 && size > 0) {
      throw new IllegalArgumentException();
    }
    final irvine.graph.Graph<Integer, Integer> g = new irvine.graph.Graph<>();
    for (int k = 0; k < order; ++k) {
      g.addVertex(k);
    }
    final Random r = new Random(seed);
    for (int k = 0; k < size; ++k) {
      g.addEdge(g.getVertex(r.nextInt(order)), g.getVertex(r.nextInt(order)), k);
    }
    return g;
  }
}
