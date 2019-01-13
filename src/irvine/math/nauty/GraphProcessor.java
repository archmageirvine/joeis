package irvine.math.nauty;

import irvine.math.graph.Graph;

import java.io.IOException;

/**
 * Graph processor.
 * @author Sean A. Irvine
 */
public interface GraphProcessor {

  /**
   * Process a graph.
   * @param graph graph
   * @throws IOException if an I/O error occurs.
   */
  void process(final Graph graph) throws IOException;
}
