package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265428 Number of ON (black) cells in the n-th iteration of the "Rule 188" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A265428 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A265428() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 2, 4, 4});
  }
}
