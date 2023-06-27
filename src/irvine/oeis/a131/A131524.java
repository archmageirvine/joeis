package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131524 Number of possible palindromic rows (or columns) in an n X n crossword puzzle.
 * @author Sean A. Irvine
 */
public class A131524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131524() {
    super(1, new long[] {-1, 1, -1, 1, 1}, new long[] {0, 0, 1, 1, 2});
  }
}
