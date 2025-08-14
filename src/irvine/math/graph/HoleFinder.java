package irvine.math.graph;

/**
 * Check a graph for a hole.
 * @author Sean A. Irvine
 */
class HoleFinder {

  private final Graph mG;
  private final int mN;
  private final int mMinLength;

  public HoleFinder(final Graph g, final int minLength) {
    mG = g;
    mN = g.order();
    mMinLength = minLength;
  }

  /* DFS to find chordless cycles starting from 'start' which is the lowest number vertex in the cycle */
  private boolean dfs(final int start, final int current, final boolean[] visited, final int[] path, final int pathPos) {
    for (int next = mG.nextVertex(current, start - 1); next >= 0; next = mG.nextVertex(current, next)) {
      if (next == start && pathPos >= mMinLength) {
        // Closing a cycle
        if (isChordless(path, pathPos)) {
          return true;
        }
        continue;
      }
      if (!visited[next]) {
        visited[next] = true;
        path[pathPos] = next;
        if (dfs(start, next, visited, path, pathPos + 1)) {
          return true;
        }
        visited[next] = false;
      }
    }
    return false;
  }

  private boolean isChordless(final int[] cycle, final int m) {
    for (int i = 0; i < m; ++i) {
      for (int j = i + 1; j < m; ++j) {
        int diff = j - i;
        if (diff == 1 || (i == 0 && j == m - 1)) {
          continue; // consecutive or closing
        }
        if (mG.isAdjacent(cycle[i], cycle[j])) {
          return false; // chord
        }
      }
    }
    return true;
  }

  /** Returns true if the graph has an induced cycle of length >= minLength */
  boolean hasHole() {
    final boolean[] visited = new boolean[mN];
    final int[] path = new int[mN];
    for (int start = 0; start < mN; ++start) {
      path[0] = start;
      visited[start] = true;
      if (dfs(start, start, visited, path, 1)) {
        return true;
      }
      visited[start] = false;
    }
    return false;
  }
}
