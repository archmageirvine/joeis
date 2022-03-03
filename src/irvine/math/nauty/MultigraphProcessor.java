package irvine.math.nauty;

/**
 * Multigraph processor.
 * @author Sean A. Irvine
 */
public interface MultigraphProcessor {

  /**
   * Process a graph.
   * @param v number of vertices
   * @param e number of edges
   * @param deg node degrees
   */
  void process(final int v, final int e, final int[] deg);
}
