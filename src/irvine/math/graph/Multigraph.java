package irvine.math.graph;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.util.Permutation;
import irvine.util.array.Sort;

/**
 * Multigraph with canonicalization support.
 * @author Sean A. Irvine
 */
public class Multigraph implements Comparable<Multigraph> {

  private final int[][] mAdj;

  private Multigraph(final int[][] adj) {
    mAdj = adj;
  }

  /**
   * Construct a multigraph with the specified number of vertices.
   * @param n number of vertices.
   */
  public Multigraph(final int n) {
    this(new int[n][n]);
  }

  /**
   * Return a copy of this graph restricted or expanded to the given
   * number of vertices.
   * @param n number of vertices
   * @return copy of graph
   */
  public Multigraph copy(final int n) {
    final int[][] a = new int[n][];
    for (int k = 0; k < Math.min(n, mAdj.length); ++k) {
      a[k] = Arrays.copyOf(mAdj[k], n);
    }
    for (int k = mAdj.length; k < n; ++k) {
      a[k] = new int[n];
    }
    return new Multigraph(a);
  }

  /**
   * Return a copy of this graph.
   * @return copy
   */
  public Multigraph copy() {
    return copy(mAdj.length);
  }

  @Override
  public boolean equals(final Object obj) {
    return obj instanceof Multigraph && Arrays.deepEquals(mAdj, ((Multigraph) obj).mAdj);
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(mAdj);
  }

  @Override
  public String toString() {
    return Arrays.deepToString(mAdj);
  }

  private int canonCompare(final Multigraph that) {
    // order and size are known to be equal
    for (int k = 0; k < mAdj.length; ++k) {
      final int deg = Integer.compare(degree(k), that.degree(k));
      if (deg != 0) {
        return deg;
      }
    }
    for (int k = 0; k < mAdj.length; ++k) {
      for (int j = 0; j < mAdj.length; ++j) {
        final int e = Integer.compare(mAdj[k][j], that.mAdj[k][j]);
        if (e != 0) {
          return e;
        }
      }
    }
    return 0;
  }

  @Override
  public int compareTo(final Multigraph that) {
    final int order = Integer.compare(order(), that.order());
    if (order != 0) {
      return order;
    }
    final int size = Integer.compare(size(), that.size());
    if (size != 0) {
      return size;
    }
    return canonCompare(that);
  }

  /**
   * Number of vertices.
   * @return the order
   */
  public int order() {
    return mAdj.length;
  }

  /**
   * Number of edges.
   * @return size of the graph.
   */
  public int size() {
    int size = 0;
    for (int k = 0; k < order(); ++k) {
      size += degree(k);
    }
    return size / 2;
  }

  /**
   * Add an edge.
   * @param u first vertex
   * @param v second vertex
   */
  public void addEdge(final int u, final int v) {
    ++mAdj[u][v];
    ++mAdj[v][u];
  }

  /**
   * Remove an edge.
   * @param u first vertex
   * @param v second vertex
   */
  public void removeEdge(final int u, final int v) {
    --mAdj[u][v];
    --mAdj[v][u];
  }

  /**
   * Get the degree of a vertex.
   * @param u vertex
   * @return degree of vertex
   */
  public int degree(final int u) {
    int d = mAdj[u][u];  // loops contribute 2 to degree
    for (int k = 0; k < mAdj.length; ++k) {
      d += mAdj[u][k];
    }
    return d;
  }

  /**
   * Return the multiplicity of an edge.
   * @param u first vertex
   * @param v second vertex
   * @return multiplicity
   */
  public int edge(final int u, final int v) {
    return mAdj[u][v];
  }

  private Multigraph permute(final int[] perm) {
    final int[][] a = new int[order()][order()];
    for (int u = 0; u < order(); ++u) {
      // vertex u -> perm[u]
      for (int v = 0; v < order(); ++v) {
        // vertex v -> perm[v]
        a[u][v] = mAdj[perm[u]][perm[v]];
      }
    }
    return new Multigraph(a);
  }

  private boolean bump(final Permutation[] perms) {
    // Increment across all permutation state objects
    for (int k = 0; perms[k] != null; ++k) {
      if (perms[k].next() != null) {
        return true;
      }
      // Permutation k was exhausted, reset it and move to next permutation
      perms[k] = new Permutation(perms[k].current().length);
    }
    return false;
  }

  /**
   * Construct the canonical representative of this multigraph.
   * @return canonical form
   */
  public Multigraph canon() {
    // First arrange vertices in degree order
    final int n = order();
    final int[] id = new int[n];
    final long[] deg = new long[n];
    for (int k = 0; k < n; ++k) {
      id[k] = k;
      final int d = degree(k);
      deg[k] = d;
    }
    Sort.sort(deg, id);
    // Form initial vertex arrangement based on increasing degree
    Multigraph res = permute(id);
    // Work out offsets for each degree increase
    final int[] offset = new int[n];
    final int[] arity = new int[n];
    arity[0] = 1;
    for (int k = 1, j = 0; k < deg.length; ++k) {
      if (deg[k] != deg[k - 1]) {
        offset[++j] = k;
        arity[j] = 1;
      } else {
        ++arity[j];
      }
    }
    // If there are j vertices of degree d, we try all permutation of those vertices
    // Obviously we only need to permute those with multiple options
    final Permutation[] perms = new Permutation[n];
    int j = 0;
    for (int k = 0; k < arity.length; ++k) {
      if (arity[k] > 1) {
        perms[j] = new Permutation(arity[k]);
        offset[j] = offset[k]; // pack offsets leftward
        ++j;
      }
    }
    //System.out.println("deg=" + Arrays.toString(deg) + " " + Arrays.toString(id) + " " + this + " -> " + res + " j=" + j + " arity=" + Arrays.toString(arity) + " offsets=" + Arrays.toString(offset));

    final Multigraph sorted = res;
    final int[] vertexPerm = IntegerUtils.identity(new int[n]);
    while (bump(perms)) {
      for (int k = 0; perms[k] != null; ++k) {
        final int o = offset[k];
        final int[] p = perms[k].current();
        for (int i = 0; i < p.length; ++i) {
          vertexPerm[o + i] = o + p[i];
        }
      }
      //System.out.println(" p=" + Arrays.toString(vertexPerm));
      final Multigraph m = sorted.permute(vertexPerm);
      if (m.canonCompare(res) < 0) {
        res = m;
      }
    }

//    if (!res.equals(simpleCanon())) {
//      System.out.println("Mismatch: " + res + " cf. " + simpleCanon());
//    }

  //  System.out.println("res=" + res);
    return res;

  }

  private Multigraph simpleCanon() {
    // Simpler implementation that simply tries every possible permutation of vertices
    Multigraph res = this;
    final Permutation perm = new Permutation(order());
    int[] p;
    while ((p = perm.next()) != null) {
      final Multigraph m = permute(p);
      if (m.canonCompare(res) < 0) {
        res = m;
      }
    }
    return res;
  }
}
