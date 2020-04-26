package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267054 Binary representation of the n-th iteration of the "Rule <code>93"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267054 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267054() {
    super(new long[] {1000000, 0, -1010100, 0, 10101, 0}, new long[] {1, 11, 10100, 101111, 101010000, 1010111111});
  }
}
