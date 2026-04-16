package irvine.math.graph;

import java.util.HashSet;
import java.util.Set;

/**
 * Join two graphs in all possible ways with edges.
 * @author Sean A. Irvine
 */
public final class Join {

  private Join() { }

  private static void build(final HashSet<Graph> res, final Graph r, final Graph g, final Graph h, final int u, final int v) {
    res.add(GraphUtils.canon(r));
    if (u >= g.order()) {
      return; // We are finished
    }
    if (v >= h.order()) {
      build(res, r, g, h, u + 1, 0);
      return;
    }
    // Don't join u-v
    build(res, r, g, h, u, v + 1);
    // Join u-v
    r.addEdge(u, g.order() + v);
    build(res, r, g, h, u, v + 1);
    r.removeEdge(u, g.order() + v);
  }

  /**
   * Construct all the graphs that can be formed by adding any number of
   * edges between <code>g</code> and <code>h</code>.
   * @param g graph
   * @param h graph
   * @return set of graphs
   */
  static Set<Graph> join(final Graph g, final Graph h) {
    final int sg = g.order();
    final int sh = h.order();
    if (sg >= Long.SIZE || sh >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    // Create the combined but unconnected graph
    final Graph r = GraphFactory.create(sg + sh);
    // Copy edges from g
    for (int u = 0; u < sg; ++u) {
      for (int v = g.nextVertex(u, u); v >= 0; v = g.nextVertex(u, v)) {
        r.addEdge(u, v);
      }
    }
    // Copy edges from h
    for (int u = 0; u < sh; ++u) {
      for (int v = h.nextVertex(u, u); v >= 0; v = h.nextVertex(u, v)) {
        r.addEdge(u + sg, v + sg);
      }
    }
    final HashSet<Graph> res = new HashSet<>();
    build(res, r, g, h, 0, 0);
    return res;
  }
}
