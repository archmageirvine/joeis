package irvine.math.graph;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;

/**
 * Compute all the maximal cliques of a graph.
 * @author Sean A. Irvine
 */
public final class MaximalCliques {

  // Bron-Kerbosch with pivoting

  private final Graph mGraph;
  private final List<Z> mMaximalCliques = new ArrayList<>();
  private final Z[] mNeighborSetsCache; // computed as needed

  private MaximalCliques(final Graph graph) {
    final int n = graph.order();
    mGraph = graph;
    mNeighborSetsCache = new Z[n];
    search(Z.ZERO, Z.ONE.shiftLeft(n).subtract(1), Z.ZERO);
  }

  private int choosePivot(final Z p, final Z x) {
    return (int) (p.isZero() ? x : p).makeOdd().auxiliary();
  }

  private Z neighbors(final int v) {
    if (mNeighborSetsCache[v] == null) {
      Z n = Z.ZERO;
      int u = -1;
      while ((u = mGraph.nextVertex(v, u)) != -1) {
        n = n.setBit(u);
      }
      mNeighborSetsCache[v] = n;
    }
    return mNeighborSetsCache[v];
  }

  private void search(final Z r, Z p, Z x) {
    if (p.isZero() && x.isZero()) {
      mMaximalCliques.add(r);
      return;
    }
    final int u = choosePivot(p, x);
    for (int v = 0; v < mGraph.order(); ++v) {
      if (!mGraph.isAdjacent(u, v) && p.testBit(v)) {
        final Z n = neighbors(v);
        search(r.setBit(v), p.and(n), x.and(n));
        p = p.clearBit(v);
        x = x.setBit(v);
      }
    }
  }

  /**
   * Compute all the maximal cliques of a graph.
   * @param graph the graph
   * @return maximal cliques in the form of bit sets
   */
  public static List<Z> maximalCliques(final Graph graph) {
    final MaximalCliques maximalCliques = new MaximalCliques(graph);
    return maximalCliques.mMaximalCliques;
  }

  /**
   * Compute all the maximal independent sets of a graph.
   * @param graph the graph
   * @return maximal independent sets in the form of bit sets
   */
  public static List<Z> maximalIndependentSets(final Graph graph) {
    final MaximalCliques maximalCliques = new MaximalCliques(graph.complement());
    return maximalCliques.mMaximalCliques;
  }
}
