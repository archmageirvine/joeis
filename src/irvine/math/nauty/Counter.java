package irvine.math.nauty;

import irvine.math.graph.Graph;

/**
 * Graph counter.
 * @author Sean A. Irvine
 */
public interface Counter {

  /** A counter that simply increments for each graph. */
  Counter ONE = graph -> 1;

  /** A counter that accepts planar graphs. */
  Counter PLANAR = graph -> graph.isPlanar() ? 1 : 0;

  /**
   * Return the count for the given graph.
   * @param graph graph
   */
  long getCount(final Graph graph);
}
