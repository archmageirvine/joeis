package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193766 The number of dominoes in a largest saturated domino covering of the 3 by n board.
 * @author Sean A. Irvine
 */
public class A193766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193766() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 4, 6, 8, 11});
  }
}
