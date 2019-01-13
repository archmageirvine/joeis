package irvine.math.nauty;

/**
 * Maximum edges for a square free graph.
 * @author Sean A. Irvine
 */
public class MaxEdgesSquareFree implements MaxEdges {

  /*
   The numbers below are actual maximum edge counts.  The apparently
   anomalous value of 92 for MAX_EDGES_SQUARE_FREE[32] has been confirmed independently
   by Yang Yuansheng (as well as all the smaller MAX_EDGES_SQUARE_FREE[] values).
  */

  private static final int[] MAX_EDGES_SQUARE_FREE =
    {0, 0, 1, 3, 4, 6, 7, 9, 11, 13, 16, 18, 21, 24, 27, 30, 33, 36, 39, 42,
      46, 50, 52, 56, 59, 63, 67, 71, 76, 80, 85, 90, 92};

  @Override
  public int getMaxEdges(final int vertices) {
    return MAX_EDGES_SQUARE_FREE[vertices];
  }
}
