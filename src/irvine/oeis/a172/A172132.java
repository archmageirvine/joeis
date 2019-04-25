package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172132 Number of ways to place 2 nonattacking knights on an n X n board.
 * @author Sean A. Irvine
 */
public class A172132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172132() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 6, 28, 96, 252});
  }
}
