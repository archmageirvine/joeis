package irvine.math.graph;

import java.util.Arrays;

import irvine.math.PopCount;

/**
 * Implementation supporting up to order 64 graphs.
 * @author Sean A. Irvine
 */
public class SmallGraph extends AbstractGraph {

  static final long[] BIT = new long[Long.SIZE];

  static {
    long b = 1L;
    for (int k = BIT.length - 1; k >= 0; --k, b <<= 1) {
      BIT[k] = b;
    }
  }

  private static final long MSK63C = 0x7FFFFFFFFFFFFFFFL;

  private static long bitmask(final int x) {
    return MSK63C >>> x;
  }

  protected final long[] mAdj;

  SmallGraph(final int order) {
    mAdj = new long[order];
  }

  /**
   * Convert directly from nauty style graph into a small graph.  Hopefully this
   * can eventually be deprecated.
   *
   * @param order order of graph
   * @param adj adjacency matrix
   */
  public SmallGraph(final int order, final long[] adj) {
    mAdj = new long[order];
    System.arraycopy(adj, 0, mAdj, 0, order);
  }

  @Override
  public boolean equals(final Object obj) {
    return obj != null && getClass() == obj.getClass() && Arrays.equals(mAdj, ((SmallGraph) obj).mAdj);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(mAdj);
  }

  protected long vertexBits() {
    final int n = order();
    return n == 0 ? 0 : -1L << (Long.SIZE - n);
  }

  @Override
  public int order() {
    return mAdj.length;
  }

  @Override
  public int size() {
    int e = 0;
    for (final long v : mAdj) {
      e += PopCount.popcount(v);
    }
    return e / 2;
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
    mAdj[v2] |= BIT[v1];
  }

  @Override
  public void removeEdge(final int v1, final int v2) {
    assert v1 >= 0;
    assert v2 >= 0;
    assert v1 < mAdj.length;
    assert v2 < mAdj.length;
    mAdj[v1] &= ~BIT[v2];
    mAdj[v2] &= ~BIT[v1];
  }

  @Override
  public int nextVertex(final int v1, final int v2) {
    assert v1 >= 0;
    assert v1 < mAdj.length;
    assert v2 < mAdj.length;
    final long maskedEdges = v2 < 0 ? mAdj[v1] : mAdj[v1] & bitmask(v2);
    return maskedEdges == 0 ? -1 : Long.numberOfLeadingZeros(maskedEdges);
  }

  @Override
  public boolean isConnected() {
    final int n = order();
    if (n <= 1) {
      return true; // Trivially connected
    }
    final long vertexBits = vertexBits();
    long expanded = BIT[0];
    long seen = expanded | mAdj[0];
    while (seen != vertexBits) {
      final long notYetExpanded = seen & ~expanded;
      if (notYetExpanded == 0) {
        // Nothing remains to expand
        break;
      }
      // Choose a node we haven't yet expanded and expand it
      final int k = Long.numberOfLeadingZeros(notYetExpanded);
      expanded |= BIT[k];
      seen |= mAdj[k];
    }
    return seen == vertexBits;
  }

  @Override
  public boolean isBiconnected() {
    final int n = order();
    if (n <= 2) {
      return false;
    }
    final int[] num = new int[n];
    final int[] lp = new int[n];
    final int[] stack = new int[n];
    int sp = 0;

    long visited = BIT[0];
    int numVisited = 1;
    int v = 0;

    while (true) {
      final long sw = mAdj[v] & ~visited;
      if (sw != 0) {
        int w = v;
        // Find the next child to visit
        v = Long.numberOfLeadingZeros(sw);
        stack[++sp] = v;
        visited |= BIT[v];
        num[v] = numVisited++;
        lp[v] = num[v];
        long swv = mAdj[v] & visited & ~BIT[w];
        while (swv != 0) {
          w = Long.numberOfLeadingZeros(swv);
          swv &= ~BIT[w];
          if (num[w] < lp[v]) {
            lp[v] = num[w];
          }
        }
      } else {
        // Step back to the parent
        final int w = v;
        if (sp <= 1) {
          return numVisited == n;
        }
        v = stack[--sp];
        if (lp[w] >= num[v]) {
          return false;
        }
        if (lp[w] < lp[v]) {
          lp[v] = lp[w];
        }
      }
    }
  }

  @Override
  public long degree(final int v) {
    return PopCount.popcount(mAdj[v]);
  }

  @Override
  public Graph complement() {
    final int n = order();
    final SmallGraph res = new SmallGraph(n);
    final long vertexBits = vertexBits();
    for (int k = 0; k < n; ++k) {
      res.mAdj[k] = mAdj[k] ^ BIT[k] ^ vertexBits;
    }
    return res;
  }

  @Override
  public Graph copy(final int newOrder) {
    final SmallGraph copy = new SmallGraph(newOrder);
    System.arraycopy(mAdj, 0, copy.mAdj, 0, order());
    return copy;
  }

  /**
   * Make a given vertex isolated.
   *
   * @param v vertex
   */
  public void isolate(final int v) {
    mAdj[v] = 0;
  }

  @Override
  public Graph delete(final int v) {
    final int n = order();
    assert v >= 0 && v < n;
    final long bit = BIT[v];
    final long below = bit - 1;
    final long above = (~below) << 1;
    final SmallGraph g = new SmallGraph(n - 1);
    for (int k = 0, j = 0; k < n; ++k) {
      if (k != v) {
        //g.mAdj[j++] = ((mAdj[k] & above) >>> 1) | (mAdj[k] & below);
        g.mAdj[j++] = (mAdj[k] & above) | ((mAdj[k] & below) << 1);
      }
    }
    return g;
  }

  private boolean isCyclic(final long visited, final int prev, final int v) {
    if ((visited & mAdj[v] & ~BIT[prev]) != 0) {
      return true;
    }
    int j = -1;
    while ((j = nextVertex(v, j)) >= 0) {
      if (j != prev && isCyclic(visited | BIT[j], v, j)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean isCyclic() {
    for (int k = 0; k < order(); ++k) {
      if (isCyclic(BIT[k], k, k)) {
        return true;
      }
    }
    return false;
  }

  // todo deprecate or Z-ify

  /**
   * Get the edge vector for a vertex
   *
   * @param k vertex
   * @return edge vector
   */
  public long getEdgeVector(final int k) {
    return mAdj[k];
  }
}
