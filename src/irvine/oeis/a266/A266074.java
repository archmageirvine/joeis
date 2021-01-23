package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266074 Total number of OFF (white) cells after n iterations of the "Rule 3" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266074() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 2, 6, 8, 16});
  }
}
