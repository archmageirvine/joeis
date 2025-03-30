package irvine.math.graph;

/**
 * Test for a coloring using simple backtracking.
 * @author Sean A. Irvine
 */
final class Coloring {

  private final Graph mGraph;

  Coloring(final Graph graph) {
    mGraph = graph;
  }

  private boolean isValidColor(final int vertex, final int color, final int[] coloring) {
    for (int u = mGraph.nextVertex(vertex, -1); u >= 0 && u < vertex; u = mGraph.nextVertex(vertex, u)) {
      if (coloring[u] == color) {
        return false;
      }
    }
    return true;
  }

  private boolean color(final int numColors, final int[] coloring, int vertex) {
    while (vertex < mGraph.order() && mGraph.degree(vertex) == 0) {
      // Isolated vertices can be any color
      ++vertex;
    }
    // If all vertices are colored, we are done
    if (vertex == mGraph.order()) {
      return true;
    }
    // Try each color for the current vertex
    for (int color = 0; color < numColors; ++color) {
      if (isValidColor(vertex, color, coloring)) {
        coloring[vertex] = color;
        if (color(numColors, coloring, vertex + 1)) {
          return true; // If successful, return true
        }
      }
    }
    return false;
  }

  boolean is(final int colors) {
    // WLOG assume vertex 0 has color 0
    return mGraph.order() <= colors || color(colors, new int[mGraph.order()], 1);
  }
}
