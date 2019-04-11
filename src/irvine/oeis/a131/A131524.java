package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131524 Number of possible palindromic rows (or columns) in <code>an n</code> X n crossword puzzle.
 * @author Sean A. Irvine
 */
public class A131524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131524() {
    super(new long[] {-1, 1, -1, 1, 1}, new long[] {0, 0, 1, 1, 2});
  }
}
