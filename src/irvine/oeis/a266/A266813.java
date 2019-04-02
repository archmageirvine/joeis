package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266813 Total number of OFF (white) cells after n iterations of the "Rule 62" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266813() {
    super(new long[] {1, -1, 0, -1, 0, 1, 0, 1}, new long[] {0, 0, 2, 3, 7, 10, 14, 19});
  }
}
