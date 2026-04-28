package irvine.math.graph;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Three-connectedness testing.
 * @author Sean A. Irvine
 */
final class ThreeConnected {

  private ThreeConnected() {
  }

  static boolean isThreeConnected(final Graph graph) {
    final int n = graph.order();
    if (n < 4) {
      return false; // A 3-connected graph must have at least 4 vertices
    }
    // Try removing every pair (u, v)
    for (int u = 0; u < n; ++u) {
      for (int v = u + 1; v < n; ++v) {
        if (!isConnectedWithout(graph, u, v)) {
          return false; // Found a separating pair
        }
      }
    }
    return true;
  }

  private static boolean isConnectedWithout(final Graph graph, final int skipA, final int skipB) {
    final int n = graph.order();
    final boolean[] visited = new boolean[n];
    // Find a start vertex that is not removed
    int start = -1;
    for (int i = 0; i < n; ++i) {
      if (i != skipA && i != skipB) {
        start = i;
        break;
      }
    }
    if (start == -1) {
      return true; // trivial (shouldn't happen for n >= 4)
    }
    final Queue<Integer> queue = new ArrayDeque<>();
    queue.add(start);
    visited[start] = true;

    int seen = 1;
    while (!queue.isEmpty()) {
      final int u = queue.poll();
      for (int w = graph.nextVertex(u, -1); w >= 0; w = graph.nextVertex(u, w)) {
        if (w == skipA || w == skipB || visited[w]) {
          continue;
        }
        visited[w] = true;
        queue.add(w);
        ++seen;
      }
    }
    // Number of vertices that should be reachable is n - 2
    return seen == n - 2;
  }
}


