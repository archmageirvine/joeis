package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172123 Number of ways to place 2 nonattacking bishops on an n X n board.
 * @author Sean A. Irvine
 */
public class A172123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172123() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 4, 26, 92, 240});
  }
}
