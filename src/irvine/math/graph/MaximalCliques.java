package irvine.math.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Compute all the maximal cliques of a graph.
 * @author Sean A. Irvine
 */
public final class MaximalCliques {

  // Bron-Kerbosch with pivoting

  private final Graph mGraph;
  private final List<Long> mMaximalCliques = new ArrayList<>();

  private MaximalCliques(final Graph graph) {
    final int n = graph.order();
    if (n > 64) {
      throw new UnsupportedOperationException();
    }
    mGraph = graph;
    search(0, (1L << n) - 1, 0);
  }

  private int getLeast(long s) {
    if (s == 0) {
      return -1;
    }
    int k = 0;
    while ((s & 1) == 0) {
      ++k;
      s >>>= 1;
    }
    return k;
  }

  private int choosePivot(final long p, final long x) {
    if (p == 0) {
      return getLeast(x);
    }
    return getLeast(p);
  }

  private long neighbors(final int v) {
    long n = 0;
    int u = -1;
    while ((u = mGraph.nextVertex(v, u)) != -1) {
      n |= 1L << u;
    }
    return n;
  }

  private void search(final long r, long p, long x) {
    if (p == 0 && x == 0) {
      mMaximalCliques.add(r);
      return;
    }
    final int u = choosePivot(p, x);
    for (int v = 0; v < mGraph.order(); ++v) {
      final long vb = 1L << v;
      if (!mGraph.isAdjacent(u, v) && (p & vb) != 0) {
        final long n = neighbors(v);
        search(r | vb, p & n, x & n);
        p &= ~vb;
        x |= vb;
      }
    }
  }

  /**
   * Compute all the maximal cliques of a graph.
   * @param graph the graph
   * @return maximal cliques in the form of bit sets
   */
  public static List<Long> maximalCliques(final Graph graph) {
    final MaximalCliques maximalCliques = new MaximalCliques(graph);
    return maximalCliques.mMaximalCliques;
  }

  /**
   * Compute all the maximal independent sets of a graph.
   * @param graph the graph
   * @return maximal independent sets in the form of bit sets
   */
  public static List<Long> maximalIndependentSets(final Graph graph) {
    final MaximalCliques maximalCliques = new MaximalCliques(graph.complement());
    return maximalCliques.mMaximalCliques;
  }
}
