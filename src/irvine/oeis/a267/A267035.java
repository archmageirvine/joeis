package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267035 Binary representation of the n-th iteration of the "Rule 85" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267035 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267035() {
    super(new long[] {-10000, 0, 10001, 0}, new long[] {1, 11, 10000, 111111});
  }
}
