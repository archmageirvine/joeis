package irvine.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;

/**
 * Explore an edge 3-colouring problem. See A002830 and A002831.
 * @author Sean A. Irvine
 */
public class EdgeThreeColouring extends AbstractEdgeColouring<Integer, String> {

  // geng -D3 12 0:18 -l | multig -T -r3 | java irvine.graph.EdgeThreeColouring 3 | grep Retained | wc -l
  // Run nauty like this:  geng -D3 6 0:9 -l | multig -T -r3
  // Produces lines like this: 6 3 0 1 3 2 3 3 4 5 3
  // which is num-vertex num-edge (source dest count)*
  // This program tests if such a graph is colourable.

  private final HashSet<Map<Edge<String, Integer>, Integer>> mNonIsomorphs = new HashSet<>();

  /**
   * Prepare for 3-colouring.
   * @param graph graph to colour
   */
  public EdgeThreeColouring(final Graph<Integer, String> graph) {
    super(graph, 3);
  }

  private boolean[][] adjacencyMatrix(final List<Edge<String, Integer>> edges) {
    final boolean[][] adj = new boolean[edges.size()][edges.size()];
    for (int k = 0; k < edges.size(); ++k) {
      final Edge<String, Integer> ek = edges.get(k);
      for (int j = 0; j <= k; ++j) {
        if (ek.isAdjacent(edges.get(j))) {
          adj[k][j] = true;
          adj[j][k] = true;
        }
      }
    }
    return adj;
  }

  private int[] colours(final Map<Edge<String, Integer>, Integer> map, final List<Edge<String, Integer>> list) {
    final int[] colours = new int[list.size()];
    for (int k = 0; k < list.size(); ++k) {
      colours[k] = map.get(list.get(k));
    }
    return colours;
  }

  private boolean isIsomorphic(final boolean[][] adj1, final boolean[][] adj2, final List<Integer>[] colourToEdges, final int[] col2, final int[] pi, final int pos, final boolean[] used) {
    if (pos == pi.length) {
      return true; // We've found it
    }
    final int nextCol = col2[pos];
    // Get each possible edge we could assign to
    for (final int edge : colourToEdges[nextCol]) {
      if (!used[edge]) {
        // Ok, we are going to try pi(pos) = edge
        // Checking adjacent requirements against existing edge permutation
        final boolean[] adjPos2 = adj2[pos];
        final boolean[] adjPos1 = adj1[edge];
        boolean ok = true;
        for (int k = 0; k < pos && ok; ++k) {
          ok = adjPos2[k] == adjPos1[pi[k]];
        }
        if (ok) {
          used[edge] = true;
          pi[pos] = edge;
          final boolean res = isIsomorphic(adj1, adj2, colourToEdges, col2, pi, pos + 1, used);
          if (res) {
            return true;
          }
          used[edge] = false;
        }
      }
    }
    return false;
  }

  private final HashMap<ArrayList<Edge<String, Integer>>, boolean[][]> mCache = new HashMap<>();

  private boolean[][] cachedAdjacencyMatrix(final ArrayList<Edge<String, Integer>> edges) {
    final boolean[][] res = mCache.get(edges);
    if (res != null) {
      return res;
    }
    final boolean[][] adj = adjacencyMatrix(edges);
    mCache.put(edges, adj);
    return adj;
  }

  private final HashMap<Map<Edge<String, Integer>, Integer>, ArrayList<Edge<String, Integer>>> mCachedEdges = new HashMap<>();

  private ArrayList<Edge<String, Integer>> cachedEdges(final Map<Edge<String, Integer>, Integer> colouring) {
    final ArrayList<Edge<String, Integer>> res = mCachedEdges.get(colouring);
    if (res != null) {
      return res;
    }
    final ArrayList<Edge<String, Integer>> edges = new ArrayList<>(colouring.keySet());
    mCachedEdges.put(colouring, edges);
    return edges;
  }

  @SuppressWarnings({"unchecked", "rawtypes"})
  private boolean isIsomorphic(final Map<Edge<String, Integer>, Integer> c1, final Map<Edge<String, Integer>, Integer> c2) {
    // Going to try and map c2 onto c1. Use colour restriction when choosing edges
    // Hence helpful to have list of edges having each colour in c1
    final ArrayList<Edge<String, Integer>> edges1 = cachedEdges(c1);
    final ArrayList<Edge<String, Integer>> edges2 = new ArrayList<>(c2.keySet());
    final boolean[][] adj1 = cachedAdjacencyMatrix(edges1);
    final boolean[][] adj2 = adjacencyMatrix(edges2);
    final ArrayList<Integer>[] colourToEdges = (ArrayList<Integer>[]) new ArrayList[getColours()];
    for (int k = 0; k < colourToEdges.length; ++k) {
      colourToEdges[k] = new ArrayList<>();
    }
    for (int k = 0; k < edges1.size(); ++k) {
      colourToEdges[c1.get(edges1.get(k))].add(k);
    }
    final int[] col2 = colours(c2, edges2);
    // Take each edge in c2, try and map to each edge in c1 of same colour, but also
    // subject to adjacency requirements.
    // Form a permutation of edges, pi.  Check adjacency requirements.
    final int[] pi = new int[edges2.size()];
    final boolean[] used = new boolean[edges2.size()];
    return isIsomorphic(adj1, adj2, colourToEdges, col2, pi, 0, used);
  }

  @Override
  protected void process(final Map<Edge<String, Integer>, Integer> colouring) {
    for (final Map<Edge<String, Integer>, Integer> e : mNonIsomorphs) {
      if (isIsomorphic(e, colouring)) {
        return;
      }
    }
    mNonIsomorphs.add(new HashMap<>(colouring));
  }

  /**
   * Return the count non-isomorphic colourings for this graph.
   * @return count of colourings
   */
  public int getCount() {
    return mNonIsomorphs.size();
  }

  static Graph<Integer, String> makeGraph(final String line) {
    final String[] p = line.split(" ");
    final Graph<Integer, String> g = new Graph<>();
    final int vertexCount = Integer.parseInt(p[0]);
    for (int k = 0; k < vertexCount; ++k) {
      g.addVertex(k);
    }
    for (int k = 2; k < p.length; k += 3) {
      final Vertex<Integer, String> a = g.getVertex(Integer.valueOf(p[k]));
      final Vertex<Integer, String> b = g.getVertex(Integer.valueOf(p[k + 1]));
      for (int j = 0; j < Integer.parseInt(p[k + 2]); ++j) {
        g.addEdge(a, b, "");
      }
    }
    return g;
  }

  /**
   * Reads from standard input.
   *
   * @param args number of colours
   * @throws java.io.IOException if an I/O error occurs
   */
  public static void main(final String[] args) throws IOException {
    final int colours = Integer.parseInt(args[0]);
    Z count = Z.ZERO;
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = r.readLine()) != null) {
        if (!line.isEmpty()) {
          final Graph<Integer, String> g = makeGraph(line);
          if (g.isConnected() && g.isEdgeColourable(colours)) {
            final EdgeThreeColouring ci = new EdgeThreeColouring(g);
            ci.run();
            System.out.println(line + " colourings=" + ci.getCount());
            count = count.add(ci.getCount());
          }
        }
      }
    }
    System.out.println(count);
  }
}
