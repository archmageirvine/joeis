package irvine.oeis.a108;
// Generated by gen_seq4.pl holos [[0],[30,-22,4],[255,-175,26],[-185,414,-202],[0,-27,18]] [1,9,85,833] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A108427 Number of peaks of the form Ud in all paths from (0,0) to (3n,0) that stay in the first quadrant (but may touch the horizontal axis), consisting of steps u=(2,1), U=(1,2), or d=(1,-1).
 * @author Georg Fischer
 */
public class A108427 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A108427() {
    super(1, "[[0],[30,-22,4],[255,-175,26],[-185,414,-202],[0,-27,18]]", "[1,9,85,833]", 0);
  }
}
