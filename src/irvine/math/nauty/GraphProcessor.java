package irvine.math.nauty;

import irvine.math.graph.Graph;

/**
 * Graph processor.
 * @author Sean A. Irvine
 */
public interface GraphProcessor {

  /**
   * Process a graph.
   * @param graph graph
   */
  void process(final Graph graph);
}
