package irvine.math.graph;

import java.util.HashMap;

import irvine.util.Pair;

/**
 * Used for construction of line graphs
 * @author Sean A. Irvine
 */
class LineGraphCreator {

  private final HashMap<Pair<Integer, Integer>, Integer> mEdgeMap = new HashMap<>();
  private final Graph mL;

  private int id(final int u, final int v) {
    if (u == v) {
      throw new IllegalArgumentException("Loops not permitted");
    }
    final Pair<Integer, Integer> key = u < v ? new Pair<>(u, v) : new Pair<>(v, u);
    final Integer res = mEdgeMap.get(key);
    if (res != null) {
      return res;
    }
    final int r = mEdgeMap.size();
    mEdgeMap.put(key, r);
    return r;
  }

  LineGraphCreator(final Graph g) {
    mL = GraphFactory.create(g.size());
    for (int v = 0; v < g.order(); ++v) {
      for (int u = g.nextVertex(v, -1); u >= 0; u = g.nextVertex(v, u)) {
        final int a = id(v, u);
        for (int w = g.nextVertex(v, u); w >= 0; w = g.nextVertex(v, w)) {
          final int b = id(v, w);
          mL.addEdge(a, b);
        }
      }
    }
  }

  Graph getLineGraph() {
    return mL;
  }
}
