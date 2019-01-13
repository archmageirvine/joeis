package irvine.math.graph;

import java.util.Arrays;

/**
 * Compute a maximum independent set of a graph.
 * @author Sean A. Irvine
 */
public final class MaximumIndependentSet {

  private static final int[] EMPTY = new int[0];

  private final Graph mGraph;
  private int[] mBest;

  private MaximumIndependentSet(final Graph graph) {
    mGraph = graph;
    mBest = EMPTY;
  }

  private void search(final boolean[] included, final int[] set, final int count, final int current) {
    for (int v = current + 1; v < mGraph.order(); ++v) {
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
        if (count >= mBest.length) {
          mBest = Arrays.copyOf(set, count + 1);
        }
        search(included, set, count + 1, v);
        included[v] = false;
      }
    }
  }

  /**
   * Compute a maximum independent set for a graph
   * @param graph the graph
   * @return list of vertices in maximum independent set
   */
  public static int[] maximum(final Graph graph) {
    final MaximumIndependentSet mis = new MaximumIndependentSet(graph);
    mis.search(new boolean[graph.order()], new int[graph.order()], 0, -1);
    return mis.mBest;
  }

  /**
   * Compute the size of the largest independent set in the graph
   * @param graph the graph
   * @return cardinality of largest independent set
   */
  public static int size(final Graph graph) {
    return maximum(graph).length;
  }

}
