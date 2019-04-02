package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266259 Total number of OFF (white) cells after n iterations of the "Rule 11" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266259() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 2, 5, 7, 14});
  }
}
