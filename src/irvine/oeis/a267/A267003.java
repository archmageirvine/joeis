package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267003 Decimal representation of the n-th iteration of the "Rule 83" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267003 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267003() {
    super(new long[] {128, 0, -152, 0, 25, 0}, new long[] {1, 5, 8, 111, 64, 1919});
  }
}
