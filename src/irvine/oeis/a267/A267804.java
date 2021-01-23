package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267804 Binary representation of the n-th iteration of the "Rule 214" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267804 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267804() {
    super(new long[] {-10000, 0, 10001, 0}, new long[] {1, 111, 10111, 1100111});
  }
}
