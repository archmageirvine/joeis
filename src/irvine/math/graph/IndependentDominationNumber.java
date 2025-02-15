package irvine.math.graph;

import java.util.Arrays;

/**
 * Compute the independent domination number of a graph.
 * Uses a simplistic branch and bound search.
 * @author Sean A. Irvine
 */
class IndependentDominationNumber {

  private static boolean isDominatingSet(final boolean[] currentSet, final boolean[] deletedVertices) {
    for (int k = 0; k < deletedVertices.length; ++k) {
      if (!deletedVertices[k] && !currentSet[k]) {
        return false;
      }
    }
    return true;
  }

  static int branchAndBound(final Graph graph, final boolean[] currentSet, final boolean[] deletedVertices, final int size, int bestSolution) {
    // Pruning condition: if the current solution already exceeds the best known solution, then stop searching
    if (size >= bestSolution) {
      return bestSolution;
    }
    // Check potential solution
    if (isDominatingSet(currentSet, deletedVertices)) {
      return size;
    }
    // Try each vertex in turn
    for (int v = 0; v < graph.order(); ++v) {
      if (deletedVertices[v] || currentSet[v]) {
        continue; // Skip already included or deleted vertices
      }

      // Try including v in the set
      currentSet[v] = true;

      // Track deleted vertices (those dominated by including v)
      final boolean[] newDeletedVertices = Arrays.copyOf(deletedVertices, deletedVertices.length);
      newDeletedVertices[v] = true;
      for (int u = graph.nextVertex(v, -1); u >= 0; u = graph.nextVertex(v, u)) {
        newDeletedVertices[u] = true;
      }
      bestSolution = Math.min(bestSolution, branchAndBound(graph, currentSet, newDeletedVertices, size + 1, bestSolution));

      // Remove it again
      currentSet[v] = false;
    }
    return bestSolution;
  }

}

