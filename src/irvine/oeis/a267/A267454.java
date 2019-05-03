package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267454 Total number of OFF (white) cells after n iterations of the "Rule <code>131"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267454() {
    super(new long[] {1, -1, 0, -1, 0, 1, 0, 1}, new long[] {0, 2, 5, 10, 15, 23, 30, 40});
  }
}
