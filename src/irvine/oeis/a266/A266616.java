package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266616 Number of OFF (white) cells in the n-th iteration of the "Rule <code>41"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266616 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266616() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {0, 3, 3, 4, 8, 3});
  }
}
