package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266303 Number of ON (black) cells in the n-th iteration of the "Rule 15" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266303 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266303() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 2, 1, 6});
  }
}
