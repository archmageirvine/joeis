package irvine.math.graph;

import java.util.Arrays;
import java.util.Collection;

/**
 * Implementation of common graph functions.
 * @author Sean A. Irvine
 */
public abstract class AbstractGraph implements Graph {

  @Override
  public boolean isMinimallyBiconnected() {
    if (!isBiconnected()) {
      return false;
    }
    for (int u = 0; u < order(); ++u) {
      int v = u; // Only need to check each edge once (do this with v > u)
      while ((v = nextVertex(u, v)) >= 0) {
        removeEdge(u, v);
        final boolean stillBiconnected = isBiconnected();
        addEdge(u, v);
        if (stillBiconnected) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public long inDegree(final int v) {
    return degree(v);
  }

  @Override
  public Graph converse() {
    return this;
  }

  @Override
  public Collection<Graph> biconnectedComponents() {
    return BiconnectedComponents.biconnectedComponents(this);
  }

  @Override
  public boolean isPlanar() {
    return Planarity.isPlanar(this);
  }

  @Override
  public Graph copy() {
    return copy(order());
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("{");
    for (int k = 0; k < order(); ++k) {
      for (int j = 0; j <= k; ++j) {
        if (isAdjacent(k, j)) {
          if (sb.length() > 1) {
            sb.append(", ");
          }
          sb.append(j).append('-').append(k);
        }
      }
    }
    sb.append('}');
    return sb.toString();
  }

  private boolean solveHamiltonian(final long used, final int count, final int current) {
    if (count > 1 && current == 0) {
      return count == order();
    }
    int v = -1;
    while ((v = nextVertex(current, v)) >= 0) {
      final long bit = 1L << v;
      if ((used & bit) == 0 && solveHamiltonian(used | bit, count + 1, v)) {
        return true;
      }
    }
    return false;
  }

  private boolean passesOreTest() {
    final int n = order();
    if (n < 3) {
      return false;
    }
    for (int u = 1; u < n; ++u) {
      final long du = degree(u);
      for (int v = 0; v < u; ++v) {
        if (du + degree(v) < n) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public boolean isHamiltonian() {
    // Some basic checks first
    final int n = order();
    if (n == 1) {
      return true;
    }
    final int diracLimit = (n + 1) / 2;
    boolean certain = true;
    for (int k = 0; k < n; ++k) {
      final long degree = degree(k);
      if (degree <= 1) {
        return false;
      }
      if (degree < diracLimit) {
        certain = false;
      }
    }
    if (certain && n >= 3) {
      // Dirac (1952), true for simple graphs
      return true;
    }
    if (passesOreTest()) {
      return true;
    }
    // Recursive path finding.
    // Make it like we haven't yet used vertex 0, even though we start there
    return solveHamiltonian(0, 0, 0);
  }

  @Override
  public int girth() {
    final int n = order();
    final int[] dist = new int[n];
    final int[] queue = new int[n];
    int best = n + 3;
    for (int v = 0; v < n; ++v) {
      Arrays.fill(dist, -1);
      queue[0] = v;
      dist[v] = 0;
      int head = 0;
      int tail = 1;
      while (head < tail) {
        final int w = queue[head++];
        final int dw1 = dist[w] + 1;
        int k = -1;
        while ((k = nextVertex(w, k)) >= 0) {
          if (dist[k] < 0) {
            dist[k] = dw1;
            queue[tail++] = k;
          } else if (dist[k] >= dist[w]) {
            final int c = dw1 + dist[k];
            if (c < best) {
              best = c;
            }
            if ((c & 1) != 0 || c > best) {
              break;
            }
          }
        }
        if (k >= 0) {
          break;
        }
      }
      if (best == 3) {
        return 3;
      }
    }
    return best > n ? 0 : best;
  }

  private int mDfs;
  private long mVisited;

  private void dfs(final int[] parents, final int[] order, final long[] backEdges, final int u, final int parent) {
    order[mDfs++] = u;
    final long bitU = 1L << u;
    mVisited |= bitU;
    parents[u] = parent;
    int v = -1;
    while ((v = nextVertex(u, v)) >= 0) {
      if (v != parent) {
        if ((mVisited & (1L << v)) != 0) {
          backEdges[v] |= bitU;
        } else {
          dfs(parents, order, backEdges, v, u);
        }
      }
    }
  }

  @Override
  public boolean isTwoEdgeConnected() {
    final int n = order();
    if (n < 2) {
      return false;
    }
    final int[] parents = new int[n];
    final long[] backEdges = new long[n]; // bit sets
    final int[] order = new int[n];
    mDfs = 0;
    mVisited = 0; // bit set
    dfs(parents, order, backEdges, 0, 0);
    if (mDfs != n) {
      return false;    // disconnected
    }
    long visited = 0; // bit set
    int traversed = 0;
    for (int k = 0; k < n; ++k) {
      final int u = order[k];
      if (backEdges[u] != 0) {
        visited |= 1L << u;
        final long b = backEdges[u];
        for (int v = 0; v < 64; ++v) {
          if ((b & (1L << v)) != 0) {
            int w = v;
            long bitW;
            while ((visited & (bitW = 1L << w)) == 0) {
              visited |= bitW;
              w = parents[w];
              ++traversed;
            }
          }
        }
      }
    }
    return traversed == n - 1;
  }

  @Override
  public boolean isMinimallyTwoEdgeConnected() {
    if (!isTwoEdgeConnected()) {
      return false;
    }
    for (int u = 0; u < order(); ++u) {
      int v = u; // Only need to check each edge once (do this with v > u)
      while ((v = nextVertex(u, v)) >= 0) {
        removeEdge(u, v);
        final boolean still2EdgeConnected = isTwoEdgeConnected();
        addEdge(u, v);
        if (still2EdgeConnected) {
          return false;
        }
      }
    }
    return true;
  }

  private void dfs(final int u) {
    mVisited |= 1L << u;
    int v = -1;
    while ((v = nextVertex(u, v)) >= 0) {
      if ((mVisited & (1L << v)) == 0) {
        dfs(v);
      }
    }
  }

  @Override
  public int numberOfComponents() {
    int count = 0;
    mVisited = 0;
    for (int k = 0; k < order(); ++k) {
      if ((mVisited & (1L << k)) == 0) {
        ++count;
        dfs(k);
      }
    }
    return count;
  }
}
