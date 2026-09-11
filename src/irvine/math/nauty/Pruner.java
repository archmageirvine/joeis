package irvine.math.nauty;

import irvine.math.graph.Graph;

/**
 * Functional interface for graph pruning.
 * @author Sean A. Irvine
 */
@FunctionalInterface
public interface Pruner {

  /** Default, accept all graphs. */
  Pruner DEFAULT = (graph, order) -> false;

  /**
   * Test if a given graph should be pruned during generation.
   * @param g the graph
   * @param order order of graph
   * @return true if the graph should be pruned
   */
  boolean apply(final Graph g, final int order);
}
