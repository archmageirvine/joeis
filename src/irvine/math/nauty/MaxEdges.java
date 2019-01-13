package irvine.math.nauty;

/**
 * The maximum number of edges for a certain type of graph of given number of nodes.
 * @author Sean A. Irvine
 */
public interface MaxEdges {

  /**
   * Return the maximum number of edges in a graph
   * @param vertices number of vertices
   * @return number of edges
   */
  int getMaxEdges(final int vertices);
}
