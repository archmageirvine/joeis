package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266614 Number of ON (black) cells in the n-th iteration of the "Rule 41" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266614 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266614() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {1, 0, 2, 3, 1, 8});
  }
}
