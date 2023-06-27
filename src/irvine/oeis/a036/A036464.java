package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036464 Number of ways to place two nonattacking queens on an n X n board.
 * @author Sean A. Irvine
 */
public class A036464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036464() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 8, 44, 140});
  }
}
