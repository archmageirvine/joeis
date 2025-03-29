package irvine.math.graph;

import java.util.Arrays;

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
    for (int u = mGraph.nextVertex(vertex, -1); u >= 0; u = mGraph.nextVertex(vertex, u)) {
      if (coloring[u] == color) {
        return false;
      }
    }
    return true;
  }

  private boolean graphColoring(final int numColors, final int[] coloring, final int vertex) {
    // If all vertices are colored, we are done
    if (vertex == mGraph.order()) {
      return true;
    }
    // Try each color for the current vertex
    for (int color = 0; color < numColors; ++color) {
      if (isValidColor(vertex, color, coloring)) {
        coloring[vertex] = color;
        if (graphColoring(numColors, coloring, vertex + 1)) {
          return true; // If successful, return true
        }
        coloring[vertex] = -1;
      }
    }
    return false;
  }

  boolean is(final int colors) {
    // Checks with a simple backtracking search
    final int numVertices = mGraph.order();
    final int[] coloring = new int[numVertices];
    Arrays.fill(coloring, -1);
    return graphColoring(colors, coloring, 0);
  }
}

