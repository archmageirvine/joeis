package irvine.math.nauty;

import irvine.math.graph.Graph;

/**
 * Multigraph processor.
 * @author Sean A. Irvine
 */
public interface VertexColourProcessor {

  /**
   * Process a graph.
   * @param g the graph
   * @param col colours
   * @param v number of vertices
   * @param e number of edges
   */
  void process(final Graph g, final int[] col, int v, final int e);
}
