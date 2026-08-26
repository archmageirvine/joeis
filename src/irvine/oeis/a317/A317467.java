package irvine.oeis.a317;

import irvine.oeis.a316.A316667;

/**
 * A317467 Squares visited by a (2,2)-leaper on a spirally numbered board and moving to the lowest available unvisited square at each step, squares labelled &gt;=1.
 * @author Sean A. Irvine
 */
public class A317467 extends A316667 {

  private static final int[] DELTA_X = {2, -2, 2, -2};
  private static final int[] DELTA_Y = {2, 2, -2, -2};

  /** Construct the sequence. */
  public A317467() {
    super(DELTA_X, DELTA_Y, -1);
  }
}
