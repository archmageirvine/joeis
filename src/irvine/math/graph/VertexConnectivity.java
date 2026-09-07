package irvine.math.graph;

import java.util.Arrays;

/**
 * Compute the vertex connectivity of a graph.
 * @author Sean A. Irvine
 */
public final class VertexConnectivity {

  private VertexConnectivity() { }

  /**
   * Computes the vertex connectivity of a simple undirected graph.
   * @param g The input graph
   * @return The vertex connectivity number kappa(G)
   */
  public static int connectivity(final Graph g) {
    final int n = g.order();
    // Edge cases
    if (n <= 1) {
      return 0;
    }
    // Check if the graph is already disconnected
    if (!g.isConnected()) {
      return 0;
    }
    // A complete graph K_n has vertex connectivity n - 1
    if (isComplete(g)) {
      return n - 1;
    }

    int minConnectivity = n - 1;
    // Even's Algorithm optimization: We only need to fix a set of source nodes
    // that is guaranteed to contain at least one node outside the minimum vertex cut.
    // We pick the first node 's' that has a non-neighbor, or iterate through potential sources.
    for (int s = 0; s < n; ++s) {
      // Find all nodes not adjacent to s (and not s itself)
      for (int t = 0; t < n; ++t) {
        if (s == t || g.isAdjacent(s, t)) {
          continue;
        }
        // Find min vertex cut separating s and t using Max-Flow Min-Cut
        final int flow = maxFlowVertexCut(g, s, t);
        if (flow < minConnectivity) {
          minConnectivity = flow;
        }
      }
      // Optimization: If minConnectivity reaches the minimum degree of the graph,
      // by Whitney's theorem, we can stop early.
      if (minConnectivity == getMinDegree(g)) {
        return minConnectivity;
      }
    }
    return minConnectivity;
  }

  /*
   * Translates the vertex capacity problem into a standard edge-capacity Max-Flow.
   * Each original node 'u' splits into u_in and u_out with capacity 1.
   */
  private static int maxFlowVertexCut(final Graph g, final int s, final int t) {
    final int n = g.order();
    final int totalNodes = 2 * n;
    // Residual capacity matrix:
    // i -> i + n represents node split capacity.
    // i + n -> j represents graph edges.
    final int[][] residual = new int[totalNodes][totalNodes];
    for (int i = 0; i < n; ++i) {
      // Internal vertex capacity is 1, EXCEPT for the source s and target t
      // whose internal node-split capacities are infinite (or n) because they cannot be cut.
      if (i == s || i == t) {
        residual[i][i + n] = n;
      } else {
        residual[i][i + n] = 1;
      }
      // Add directional tracking for undirected graph edges
      for (int j = 0; j < n; ++j) {
        if (g.isAdjacent(i, j)) {
          residual[i + n][j] = n; // Edges have infinite (n) capacity
        }
      }
    }
    int maxFlow = 0;
    final int sourceNode = s + n; // Flow leaves from source's output split
    final int sinkNode = t;       // Flow arrives at sink's input split
    final int[] parent = new int[totalNodes];
    final boolean[] visited = new boolean[totalNodes];

    // Augmenting path loop (Ford-Fulkerson via DFS for low connectivity values)
    while (dfs(residual, sourceNode, sinkNode, parent, visited)) {
      int pathFlow = Integer.MAX_VALUE;

      // Find bottleneck capacity along path
      for (int v = sinkNode; v != sourceNode; v = parent[v]) {
        final int u = parent[v];
        pathFlow = Math.min(pathFlow, residual[u][v]);
      }
      // Update residual capacities
      for (int v = sinkNode; v != sourceNode; v = parent[v]) {
        final int u = parent[v];
        residual[u][v] -= pathFlow;
        residual[v][u] += pathFlow;
      }
      maxFlow += pathFlow;
      Arrays.fill(visited, false); // Reset for next iteration
    }
    return maxFlow;
  }

  private static boolean dfs(final int[][] residual, final int src, final int dest, final int[] parent, final boolean[] visited) {
    visited[src] = true;
    if (src == dest) {
      return true;
    }
    for (int v = 0; v < residual.length; ++v) {
      if (!visited[v] && residual[src][v] > 0) {
        parent[v] = src;
        if (dfs(residual, v, dest, parent, visited)) {
          return true;
        }
      }
    }
    return false;
  }

  private static boolean isComplete(final Graph g) {
    final int n = g.order();
    for (int i = 0; i < n; ++i) {
      for (int j = i + 1; j < n; ++j) {
        if (!g.isAdjacent(i, j)) {
          return false;
        }
      }
    }
    return true;
  }

  private static int getMinDegree(final Graph g) {
    final int n = g.order();
    int minDegree = n;
    for (int u = 0; u < n; ++u) {
      minDegree = Math.min(minDegree, (int) g.degree(u));
    }
    return minDegree;
  }
}
