package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104159 Numbers on a Manchester or Log-End dartboard, as read in a standard, clockwise direction.
 * @author Sean A. Irvine
 */
public class A104159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104159() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {4, 20, 1, 16, 6, 17, 8, 12, 9, 14, 5, 19, 2, 15, 3, 18, 7, 11, 10, 13});
  }
}
