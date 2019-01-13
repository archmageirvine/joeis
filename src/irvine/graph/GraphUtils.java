package irvine.graph;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Random;

/**
 * Utility functions for graphs.
 *
 * @author Sean A. Irvine
 */
public final class GraphUtils {

  private GraphUtils() { }

  /**
   * Load a graph from an input stream, where the vertex labels are unique strings.
   * The file is assumed to consist of lines like <code>v1 op v2</code> representing
   * the edges of the graph. If <code>op</code> is <code>--</code> the edge is
   * undirected, other wise <code>-&gt;</code> and <code>&lt;-</code> denoted directed
   * edges.
   * Blank lines and lines starting with <code>#</code> are ignored.
   *
   * @param is input stream
   * @return graph
   * @exception IOException if an I/O error or malformed input is encountered.
   */
  public static Graph<String, String> load(final InputStream is) throws IOException {
    final Graph<String, String> g = new Graph<>();
    final HashMap<String, Vertex<String, String>> map = new HashMap<>();
    try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
      String line;
      while ((line = br.readLine()) != null) {
        if (!line.isEmpty() && line.charAt(0) != '#') {
          final String[] parts = line.split("\\s+");
          if (parts.length != 3) {
            throw new IOException("Bad line: " + line);
          }
          final Vertex<String, String> left = map.computeIfAbsent(parts[0], g::addVertex);
          final Vertex<String, String> right = map.computeIfAbsent(parts[2], g::addVertex);
          final String op = parts[1];
          if ("--".equals(op)) {
            g.addEdge(left, right, null);
          } else if ("->".equals(op)) {
            g.addDirectedEdge(left, right, null);
          } else if ("<-".equals(op)) {
            g.addDirectedEdge(right, left, null);
          } else {
            throw new IOException("Bad line: " + line);
          }
        }
      }
    }
    return g;
  }

  /**
   * Load a graph from a file.  See documentation on <code>load(InputStream is)</code>
   * for details on graph format.
   *
   * @param graphFile file containing the graph
   * @return graph
   * @exception IOException if an I/O error or malformed input is encountered.
   */
  public static Graph<String, String> load(final File graphFile) throws IOException {
    return load(new FileInputStream(graphFile));
  }

  /**
   * Construct a graph with the specified number of vertices and no edges.
   *
   * @param n number of vertices
   * @return empty graph on <code>n</code> vertices
   * @exception IllegalArgumentException if <code>n</code> is less than zero.
   */
  public static Graph<Integer, String> empty(final int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    final Graph<Integer, String> g = new Graph<>();
    for (int k = 0; k < n; ++k) {
      g.addVertex(k);
    }
    return g;
  }

  /**
   * Construct the complete graph of given order.
   *
   * @param n number of vertices
   * @return complete graph on <code>n</code> vertices
   * @exception IllegalArgumentException if <code>n</code> is less than zero.
   */
  public static Graph<Integer, String> complete(final int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    final Graph<Integer, String> g = new Graph<>();
    for (int k = 0; k < n; ++k) {
      g.addVertex(k);
    }
    for (int k = 0; k < n; ++k) {
      for (int j = k + 1; j < n; ++j) {
        g.addEdge(g.getVertex(k), g.getVertex(j), null);
      }
    }
    return g;
  }

  /**
   * Return a new undirected graph of given order and size with randomly selected
   * edges. The resulting graph may be a multigraph and may contain loops.
   *
   * @param order desired order of graph
   * @param size desired size of graph
   * @param seed random number seed
   * @return random undirected graph of given order and size
   * @exception IllegalArgumentException if either parameter is negative or if
   * the order is zero and the size positive.
   */
  public static Graph<Integer, Integer> randomUndirected(final int order, final int size, final long seed) {
    if (order < 0 || size < 0) {
      throw new IllegalArgumentException();
    }
    if (order == 0 && size > 0) {
      throw new IllegalArgumentException();
    }
    final Graph<Integer, Integer> g = new Graph<>();
    for (int k = 0; k < order; ++k) {
      g.addVertex(k);
    }
    final Random r = new Random(seed);
    for (int k = 0; k < size; ++k) {
      g.addEdge(g.getVertex(r.nextInt(order)), g.getVertex(r.nextInt(order)), k);
    }
    return g;
  }
}
