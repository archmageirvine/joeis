package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266286 Number of OFF (white) cells in the n-th iteration of the "Rule 13" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266286 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266286() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 2, 3, 3});
  }
}
