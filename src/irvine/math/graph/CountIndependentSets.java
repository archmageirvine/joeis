package irvine.math.graph;

/**
 * Count the number of independent sets in a graph.
 * @author Sean A. Irvine
 */
public final class CountIndependentSets {

  private final Graph mGraph;
  private long mCount = 1; // include empty

  private CountIndependentSets(final Graph graph) {
    mGraph = graph;
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
          ++mCount;
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
  public static long count(final Graph graph) {
    final CountIndependentSets mis = new CountIndependentSets(graph);
    mis.search(new boolean[graph.order()], new int[graph.order()], 0, -1);
    return mis.mCount;
  }
}
