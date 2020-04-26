package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266285 Number of ON (black) cells in the n-th iteration of the "Rule <code>13"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266285 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266285() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 1, 2, 4});
  }
}
