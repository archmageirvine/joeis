package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267353 Total number of ON (black) cells after n iterations of the "Rule <code>123"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267353 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267353() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 3, 6, 12, 15});
  }
}
