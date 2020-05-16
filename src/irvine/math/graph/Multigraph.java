package irvine.math.graph;

import java.util.Arrays;

import irvine.util.Permutation;

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
        a[perm[u]][perm[v]] = mAdj[u][v];
      }
    }
    return new Multigraph(a);
  }

  /**
   * Construct the canonical representative of this multigraph.
   * @return canonical form
   */
  public Multigraph canon() {
    Multigraph res = this;
    // todo this can be made smarter by an initial sort by degree and only permuting up to degree
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
