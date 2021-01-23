package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266283 Binary representation of the n-th iteration of the "Rule 13" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266283 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266283() {
    super(new long[] {1000000, 0, -1010100, 0, 10101, 0}, new long[] {1, 10, 101, 1101010, 10101, 11110101010L});
  }
}
