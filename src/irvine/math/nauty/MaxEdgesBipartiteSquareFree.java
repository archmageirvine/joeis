package irvine.math.nauty;

/**
 * Maximum edges for a square free bipartite graph.
 * @author Sean A. Irvine
 */
public class MaxEdgesBipartiteSquareFree implements MaxEdges {

  private static final int[] MAX_EDGES_BIPARTITE_SQUARE_FREE =
    {0, 0, 1, 2, 3, 4, 6, 7, 9, 10, 12, 14, 16, 18, 21, 22, 24, 26, 29, 31,
      34, 36, 39, 42, 45, 48, 52, 53, 56, 58, 61, 64, 67};

  @Override
  public int getMaxEdges(final int vertices) {
    return MAX_EDGES_BIPARTITE_SQUARE_FREE[vertices];
  }
}
