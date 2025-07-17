package irvine.math.graph;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * Compute the independence polynomial of a graph.
 * @author Sean A. Irvine
 */
public final class IndependencePolynomial {

  private final Graph mGraph;
  private final long[] mCounts;

  private IndependencePolynomial(final Graph graph) {
    mGraph = graph;
    mCounts = new long[graph.order() + 1];
    mCounts[0] = 0;
  }

  private void search(final boolean[] included, final int[] set, final int count, final int current) {
    for (int v = current + 1; v < mGraph.order(); ++v) {
      if (!mGraph.isAdjacent(v, v)) {
        int u = -1;
        boolean ok = true;
        while ((u = mGraph.nextVertex(v, u)) >= 0 && u < v) {
          if (included[u]) {
            ok = false;
            break;
          }
        }
        if (ok) {
          included[v] = true;
          set[count] = v;
          ++mCounts[count];
          search(included, set, count + 1, v);
          included[v] = false;
        }
      }
    }
  }

  /**
   * Count the number of independent sets in a graph.
   * @param graph the graph
   * @return number of independent sets
   */
  public static Polynomial<Z> getPolynomial(final Graph graph) {
    final IndependencePolynomial ip = new IndependencePolynomial(graph);
    ip.search(new boolean[graph.order()], new int[graph.order()], 0, -1);
    return Polynomial.create(ip.mCounts);
  }
}
