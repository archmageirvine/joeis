package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047659 Number of ways to place 3 nonattacking queens on an n X n board.
 * @author Sean A. Irvine
 */
public class A047659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047659() {
    super(new long[] {1, -5, 8, 0, -14, 14, 0, -8, 5}, new long[] {0, 0, 0, 0, 24, 204, 1024, 3628, 10320});
  }
}
