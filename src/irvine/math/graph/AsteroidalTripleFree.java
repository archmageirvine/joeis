package irvine.math.graph;

/**
 * Check is a graph is asteroidal triple free.
 * Three vertices of a graph form an asteroidal triple if every two of them
 * are connected by a path avoiding the neighbourhood of the third.
 * A graph is asteroidal triple free if it does not contain any asteroidal triple.
 * @author Sean A. Irvine
 */
class AsteroidalTripleFree {

  // Assumes graph is simple and connected

  private final Graph mG;

  AsteroidalTripleFree(final Graph g) {
    mG = g;
  }

  private boolean isAsteroidal(final int u, final int v, final int w) {
    // w is the excluded vertex
    if (mG.isAdjacent(u, w) || mG.isAdjacent(v, w)) {
      return false;
    }

    // Try to find path u -> v avoiding neighbours of w
    final int[] stack = new int[mG.order()];
    final boolean[] visited = new boolean[mG.order()];
    // Mark as visited neighborhood of w
    visited[w] = true;
    for (int z = mG.nextVertex(w, -1); z >= 0; z = mG.nextVertex(w, z)) {
      visited[z] = true;
    }

    int sp = 0;
    stack[0] = u;
    visited[u] = true;
    while (sp >= 0) {
      final int y = stack[sp--];
      for (int x = mG.nextVertex(y, -1); x >= 0; x = mG.nextVertex(y, x)) {
        if (x == v) {
          return true;
        }
        if (!visited[x]) {
          visited[x] = true;
          stack[++sp] = x;
        }
      }
    }
    return false;
  }

  private boolean isAsteroidalTriple(final int u, final int v, final int w) {
    return isAsteroidal(u, v, w) && isAsteroidal(u, w, v) && isAsteroidal(v, w, u);
  }

  boolean is() {
    //System.out.println("Testing: " + mG);
    final int n = mG.order();
    for (int u = 2; u < n; ++u) {
      for (int v = 1; v < u; ++v) {
        for (int w = 0; w < v; ++w) {
          if (isAsteroidalTriple(u, v, w)) {
            //System.out.println("Testing: " + mG + " false");
            return false;
          }
        }
      }
    }
    //System.out.println("Testing: " + mG + " true");
    return true;
  }
}
