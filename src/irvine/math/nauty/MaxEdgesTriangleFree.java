package irvine.math.nauty;

/**
 * Maximum edges for a triangle free graph.
 * @author Sean A. Irvine
 */
public class MaxEdgesTriangleFree implements MaxEdges {

  @Override
  public int getMaxEdges(final int vertices) {
    return vertices * vertices / 4;
  }
}
