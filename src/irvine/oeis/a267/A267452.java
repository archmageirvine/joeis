package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267452 Total number of ON (black) cells after n iterations of the "Rule <code>131"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267452 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267452() {
    super(new long[] {1, -1, 0, -1, 0, 1, 0, 1}, new long[] {1, 2, 4, 6, 10, 13, 19, 24});
  }
}
