package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266257 Total number of ON (black) cells after n iterations of the "Rule <code>11"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266257 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266257() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 4, 9, 11});
  }
}
