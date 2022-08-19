package irvine.oeis.a005;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A005340 Number of ways in which n identical balls can be distributed among 7 boxes in a row such that each pair of adjacent boxes contains at least 4 balls.
 * @author Georg Fischer
 */
public class A005340 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A005340() {
    super(12, "[0,-1, 7,-21, 35,-35, 21,-7, 1]", "[1, 13, 76, 295, 889, 2188, 4652, 8891]", 0);
  }
}
