package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267214 Total number of OFF (white) cells after n iterations of the "Rule 109" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267214 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267214() {
    super(new long[] {1, -1, 0, -1, 0, 1, 0, 1}, new long[] {0, 2, 2, 7, 9, 13, 16, 26});
  }
}
