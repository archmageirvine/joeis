package irvine.math.plantri;

/**
 * A common interface for paired routines for extending and reducing a graph.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
interface ExtenderReducer {

  /**
   * Extend at the given edge (exact semantics depends on implementation).
   * @param e edge
   * @return extension (may be null)
   */
  Edge extend(final Edge e);

  /**
   * Reduce the given edge (exact semantics depends on implementation).
   * @param e edge
   */
  void reduce(final Edge e);

  // In addition many of these classes also implement a legality test, but the parameters
  // are different for each implementation.
}
