package irvine.math.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import irvine.math.function.Functions;

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
  public boolean isEulerian() {
    for (int k = 0; k < order(); ++k) {
      if ((degree(k) & 1) == 1) {
        return false;
      }
    }
    return true;
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

  protected boolean solveHamiltonian(final long used, final int count, final int current) {
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
    if (order() > 64) {
      throw new UnsupportedOperationException();
    }
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

  private void assignComponentAndSearch(final int[] componentNumber, final int[] componentSize, final int u, final int cn) {
    componentNumber[u] = cn;
    ++componentSize[cn];
    int v = -1;
    while ((v = nextVertex(u, v)) >= 0) {
      if (componentNumber[v] == 0) {
        assignComponentAndSearch(componentNumber, componentSize, v, cn);
      }
    }
  }

  @Override
  public Collection<Graph> components() {
    if (isConnected()) {
      return Collections.singleton(this);
    }
    final int[] componentNumber = new int[order()];
    final int[] componentSize = new int[order() + 1];
    int cn = 0;
    for (int k = 0; k < order(); ++k) {
      if (componentNumber[k] == 0) {
        assignComponentAndSearch(componentNumber, componentSize, k, ++cn);
      }
    }
    final ArrayList<Graph> components = new ArrayList<>(cn);
    for (int c = 1; c <= cn; ++c) {
      final Graph comp = GraphFactory.create(componentSize[c]);
      for (int k = 0, u = -1; k < componentNumber.length; ++k) {
        if (componentNumber[k] == c) {
          ++u;
          for (int j = k, v = u - 1; j < componentNumber.length; ++j) {
            if (componentNumber[j] == c) {
              ++v;
              if (isAdjacent(k, j)) {
                comp.addEdge(u, v);
              }
            }
          }
        }
      }
      components.add(comp);
    }
    return components;
  }

  @Override
  public int[] distanceVector(final int v) {
    final int[] d = new int[order()];
    final int[] queue = new int[order()];
    Arrays.fill(d, -1);
    d[v] = 0;
    queue[0] = v;
    for (int next = 0, free = 0; next <= free; ++next) {
      final int u = queue[next];
      for (int w = nextVertex(u, -1); w >= 0; w = nextVertex(u, w)) {
        if (d[w] < 0) {
          d[w] = d[u] + 1;
          queue[++free] = w;
        }
      }
    }
    return d;
  }

  @Override
  public long wienerIndex() {
    long sum = 0;
    for (int v = 0; v < order(); ++v) {
      sum += Functions.SUM.l(distanceVector(v));
    }
    return sum;
  }

  @Override
  public Graph lineGraph() {
    return new LineGraphCreator(this).getLineGraph();
  }

  @Override
  public int diameter() {
    int diameter = 0;
    for (int v = 0; v < order(); ++v) {
      final int[] dv = distanceVector(v);
      for (final int u : dv) {
        if (u < 0) {
          return -1;
        }
      }
      final int m = Functions.MAX.i(dv);
      diameter = Math.max(diameter, m);
    }
    return diameter;
  }

  @Override
  public boolean hasK4() {
    if (order() < 4) {
      return false;
    }
    for (int u = 0; u < order(); ++u) {
      if (degree(u) >= 3) {
        for (int v = nextVertex(u, u); v >= 0; v = nextVertex(u, v)) {
          if (degree(v) >= 3) {
            for (int w = nextVertex(v, v); w >= 0; w = nextVertex(v, w)) {
              if (degree(w) >= 3 && isAdjacent(u, w)) {
                for (int x = nextVertex(w, w); x >= 0; x = nextVertex(w, x)) {
                  if (degree(x) >= 3 && isAdjacent(x, u) && isAdjacent(x, v)) {
                    return true;
                  }
                }
              }
            }
          }
        }
      }
    }
    return false;
  }

  @Override
  public boolean hasK5() {
    if (order() < 5) {
      return false;
    }
    for (int u = 0; u < order(); ++u) {
      if (degree(u) >= 4) {
        for (int v = nextVertex(u, u); v >= 0; v = nextVertex(u, v)) {
          if (degree(v) >= 4) {
            for (int w = nextVertex(v, v); w >= 0; w = nextVertex(v, w)) {
              if (degree(w) >= 4 && isAdjacent(u, w)) {
                for (int x = nextVertex(w, w); x >= 0; x = nextVertex(w, x)) {
                  if (degree(x) >= 4 && isAdjacent(x, u) && isAdjacent(x, v)) {
                    for (int y = nextVertex(x, x); y >= 0; y = nextVertex(x, y)) {
                      if (degree(y) >= 4 && isAdjacent(y, u) && isAdjacent(y, v) && isAdjacent(y, w) && isAdjacent(y, x)) {
                        return true;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return false;
  }
}
