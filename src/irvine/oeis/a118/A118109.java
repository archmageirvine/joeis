package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118109 Binary representation of n-th iteration of the Rule 54 elementary cellular automaton starting with a single black cell.
 * @author Sean A. Irvine
 */
public class A118109 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A118109() {
    super(new long[] {-10000, 0, 10001, 0}, new long[] {1, 111, 10001, 1110111});
  }
}
