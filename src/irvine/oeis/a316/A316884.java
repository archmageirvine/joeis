package irvine.oeis.a316;

/**
 * A316884 Squares visited by moving diagonally one square on a spirally numbered board and moving to the lowest available unvisited square at each step.
 * @author Sean A. Irvine
 */
public class A316884 extends A316667 {

  private static final int[] DELTA_X = {1, -1, 1, -1};
  private static final int[] DELTA_Y = {1, 1, -1, -1};

  /** Construct the sequence. */
  public A316884() {
    super(DELTA_X, DELTA_Y, -1);
  }
}
