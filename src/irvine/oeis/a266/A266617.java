package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266617 Total number of OFF (white) cells after n iterations of the "Rule 41" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266617 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266617() {
    super(new long[] {1, -1, -1, 1, -1, 1, 1}, new long[] {0, 3, 6, 10, 18, 21, 32});
  }
}
