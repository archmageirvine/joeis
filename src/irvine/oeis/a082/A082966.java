package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082966 Number of inequivalent ways (mod D_4) three checkers can be placed on an n X n board.
 * @author Sean A. Irvine
 */
public class A082966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082966() {
    super(new long[] {1, -3, -1, 11, -6, -14, 14, 6, -11, 1, 3}, new long[] {0, 1, 16, 77, 319, 920, 2397, 5278, 10874, 20355, 36390});
  }
}
