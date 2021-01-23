package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262862 Decimal representation of the n-th iteration of the "Rule 147" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A262862 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A262862() {
    super(new long[] {-16, 0, 17, 0}, new long[] {1, 5, 17, 93});
  }
}
