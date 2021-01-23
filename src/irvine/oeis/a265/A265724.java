package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265724 Total number of OFF (white) cells after n iterations of the "Rule 1" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A265724 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A265724() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 3, 7, 10, 18});
  }
}
