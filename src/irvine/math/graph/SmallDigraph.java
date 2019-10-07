package irvine.math.graph;

import java.util.Arrays;

/**
 * Implementation supporting up to order 64 digraphs.
 * @author Sean A. Irvine
 */
public class SmallDigraph extends SmallGraph {

  SmallDigraph(final int order) {
    super(order);
  }

  /**
   * Convert directly into a small directed graph.
   * @param order order of graph
   * @param adj adjacency matrix
   */
  public SmallDigraph(final int order, final long[] adj) {
    super(order, adj);
  }

  @Override
  public int size() {
    int e = 0;
    for (final long v : mAdj) {
      e += (long) Long.bitCount(v);
    }
    return e;
  }

  @Override
  public boolean isAdjacent(final int v1, final int v2) {
    assert v1 >= 0;
    assert v2 >= 0;
    assert v1 < mAdj.length;
    assert v2 < mAdj.length;
    return (mAdj[v1] & BIT[v2]) != 0;
  }

  @Override
  public void addEdge(final int v1, final int v2) {
    assert v1 >= 0;
    assert v2 >= 0;
    assert v1 < mAdj.length;
    assert v2 < mAdj.length;
    mAdj[v1] |= BIT[v2];
  }

  @Override
  public void removeEdge(final int v1, final int v2) {
    assert v1 >= 0;
    assert v2 >= 0;
    assert v1 < mAdj.length;
    assert v2 < mAdj.length;
    mAdj[v1] &= ~BIT[v2];
  }

  @Override
  public Graph complement() {
    final int n = order();
    final SmallDigraph res = new SmallDigraph(n);
    final long vertexBits = vertexBits();
    for (int k = 0; k < n; ++k) {
      res.mAdj[k] = mAdj[k] ^ BIT[k] ^ vertexBits;
    }
    return res;
  }

  @Override
  public Graph converse() {
    final int n = order();
    final SmallDigraph res = new SmallDigraph(n);
    for (int k = 0; k < n; ++k) {
      final long e = mAdj[k];
      for (int j = 0; j < n; ++j) {
        if ((e & BIT[j]) != 0) {
          res.mAdj[j] |= BIT[k];
        }
      }
    }
    return res;
  }

  private boolean isCyclic(final long visited, final int v) {
    //System.out.println(Long.toBinaryString(visited) + " " + v + " " + Long.toBinaryString(mAdj[v]));
    if ((visited & mAdj[v]) != 0) {
      return true;
    }
    int j = -1;
    while ((j = nextVertex(v, j)) >= 0) {
      if (isCyclic(visited | BIT[j], j)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean isCyclic() {
    for (int k = 0; k < order(); ++k) {
      if (isCyclic(BIT[k], k)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public long inDegree(final int v) {
    final long b = BIT[v];
    long in = 0;
    for (final long u : mAdj) {
      if ((u & b) != 0) {
        ++in;
      }
    }
    return in;
  }

  @Override
  public boolean isHamiltonian() {
    // Some basic checks first
    final int n = order();
    if (n == 1) {
      return true;
    }
    for (int k = 0; k < n; ++k) {
      if (degree(k) < 1 || inDegree(k) < 1) {
        return false;
      }
    }
    // Recursive path finding.
    // Make it like we haven't yet used vertex 0, even though we start there
    return solveHamiltonian(0, 0, 0);
  }

  @Override
  public Graph copy(final int newOrder) {
    final SmallDigraph copy = new SmallDigraph(newOrder);
    System.arraycopy(mAdj, 0, copy.mAdj, 0, order());
    return copy;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("{");
    for (int k = 0; k < order(); ++k) {
      for (int j = 0; j < order(); ++j) {
        if (isAdjacent(j, k)) {
          if (sb.length() > 1) {
            sb.append(", ");
          }
          sb.append(j).append("->").append(k);
        }
      }
    }
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(final Object obj) {
    return obj instanceof SmallDigraph && Arrays.equals(mAdj, ((SmallDigraph) obj).mAdj);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(mAdj) ^ 1;
  }
}
