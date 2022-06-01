package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014409 Number of inequivalent ways (mod D_4) a pair of checkers can be placed on an n X n board.
 * @author Sean A. Irvine
 */
public class A014409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014409() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 2, 8, 21, 49, 93, 171, 278});
  }
}
