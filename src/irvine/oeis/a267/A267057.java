package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267057 Binary representation of the n-th iteration of the "Rule <code>97"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267057 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267057() {
    super(new long[] {-100000000, 0, 100000000, 0, 1, 0}, new long[] {1, 0, 10100, 10011, 100000000, 11111111});
  }
}
