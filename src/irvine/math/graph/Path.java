package irvine.math.graph;

/**
 * Various graph path finding functions.
 * @author Sean A. Irvine
 */
public final class Path {

  private Path() { }

  /**
   * Find (if possible) a shortest path between vertices of a graph.
   * @param g the graph
   * @param u start vertex
   * @param v end vertex
   * @return path (including start and end) or null if no path exists
   */
  public static int[] shortestPath(final Graph g, final int u, final int v) {
    final int[] prior = new int[g.order()];
    final int[] dist = new int[g.order()];
    final int[] queue = new int[g.order()];
    queue[0] = u;
    dist[u] = 1; // count from 1 rather than 0 so can use 0 as unexplored
    int qFree = 1;
    int qDone = 0;
    while (qDone != qFree) {
      final int w = queue[qDone++];  // vertex to expand
      int x = -1;
      while ((x = g.nextVertex(w, x)) >= 0) {
        if (dist[x] == 0) {
          // x is not yet expanded
          prior[x] = w;
          dist[x] = dist[w] + 1;
          queue[qFree++] = x;
          if (x == v) {
            final int[] path = new int[dist[x]];
            for (int k = path.length - 1; k >= 0; --k) {
              path[k] = x;
              x = prior[x];
            }
            return path;
          }
        }
      }
    }
    return null;
  }

  /**
   * Find a longest path (not using a vertex more than once) starting at a specified
   * vertex.
   * @param g the graph
   * @param v start vertex
   * @return path (including start)
   */
  public static int[] longestPath(final Graph g, final int v) {
    final int[] prior = new int[g.order()];
    final int[] dist = new int[g.order()];
    final int[] queue = new int[g.order()];
    queue[0] = v;
    dist[v] = 1; // count from 1 rather than 0 so can use 0 as unexplored
    int qFree = 1;
    int qDone = 0;
    int w;
    do {
      w = queue[qDone++];  // vertex to expand
      int x = -1;
      while ((x = g.nextVertex(w, x)) >= 0) {
        if (dist[x] == 0) {
          // x is not yet expanded
          prior[x] = w;
          dist[x] = dist[w] + 1;
          queue[qFree++] = x;
        }
      }
    } while (qDone != qFree);
    final int[] path = new int[dist[w]];
    for (int k = path.length - 1; k >= 0; --k) {
      path[k] = w;
      w = prior[w];
    }
    return path;
  }
}
