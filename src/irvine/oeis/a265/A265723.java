package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265723 Number of OFF (white) cells in the n-th iteration of the "Rule 1" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A265723 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A265723() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 3, 4, 3});
  }
}
