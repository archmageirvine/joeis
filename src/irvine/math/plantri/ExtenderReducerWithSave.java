package irvine.math.plantri;

/**
 * A common interface for paired routines for extending and reducing a graph.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
interface ExtenderReducerWithSave {

  /**
   * Extend at the given edge (exact semantics depends on implementation).
   * @param e edge
   * @param saveList additional space for remembering edges
   * @return extension (may be null)
   */
  Edge extend(final Edge e, final Edge[] saveList);

  /**
   * Reduce the given edge (exact semantics depends on implementation).
   * @param e edge
   * @param saveList additional space for remembering edges
   */
  void reduce(final Edge e, final Edge[] saveList);
}
