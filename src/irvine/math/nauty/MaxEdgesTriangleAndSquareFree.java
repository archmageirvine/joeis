package irvine.math.nauty;

/**
 * Maximum edges for a triangle and square free graph.
 * @author Sean A. Irvine
 */
public class MaxEdgesTriangleAndSquareFree implements MaxEdges {

  private static final int[] MAX_EDGES_TRIANGLE_AND_SQUARE_FREE =
    {0, 0, 1, 2, 3, 5, 6, 8, 10, 12, 15, 16, 18, 21, 23, 26, 28, 31, 34, 38,
      41, 44, 47, 50, 54, 57, 61, 65, 68, 72, 76, 80, 85};

  @Override
  public int getMaxEdges(final int vertices) {
    return MAX_EDGES_TRIANGLE_AND_SQUARE_FREE[vertices];
  }
}
