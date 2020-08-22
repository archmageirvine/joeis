package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267926 Decimal representation of the n-th iteration of the "Rule 246" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267926 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267926() {
    super(new long[] {-16, 16, 1}, new long[] {1, 7, 23});
  }
}
