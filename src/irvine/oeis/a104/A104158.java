package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104158 Numbers on a standard, London, or clock dartboard read in a counterclockwise direction.
 * @author Sean A. Irvine
 */
public class A104158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104158() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {20, 5, 12, 9, 14, 11, 8, 16, 7, 19, 3, 17, 2, 15, 10, 6, 13, 4, 18, 1});
  }
}
