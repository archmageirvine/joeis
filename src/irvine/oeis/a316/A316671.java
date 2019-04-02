package irvine.oeis.a316;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A316671 Squares visited by moving diagonally one square on a diagonally numbered board and moving to the lowest available unvisited square at each step. 
 * @author Georg Fischer
 */
public class A316671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A316671() {
    super(new long[] {1L, -1L, -2L, 2L, 1L}, new long[] {1L, 5L, 4L, 12L, 11L});
  } // constructor()
} // A316671
