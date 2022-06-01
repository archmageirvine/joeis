package irvine.oeis.a242;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A242279 Number of inequivalent (mod D_4) ways four checkers can be placed on an n X n board.
 * @author Sean A. Irvine
 */
public class A242279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242279() {
    super(new long[] {1, -4, 1, 16, -19, -20, 45, 0, -45, 20, 19, -16, -1, 4}, new long[] {1, 23, 252, 1666, 7509, 26865, 79920, 209096, 491425, 1064575, 2150076, 4104738, 7458437, 13005041});
  }
}
