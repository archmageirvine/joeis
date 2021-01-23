package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267453 Number of OFF (white) cells in the n-th iteration of the "Rule 131" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267453 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267453() {
    super(new long[] {-1, 0, 0, 1, 1, 0, 0}, new long[] {0, 2, 3, 5, 5, 8, 7});
  }
}
