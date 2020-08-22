package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265427 Binary representation of the n-th iteration of the "Rule 188" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A265427 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A265427() {
    super(new long[] {-10000, 0, 10000, 0, 1, 0}, new long[] {1, 11, 101, 1111, 11101, 110111});
  }
}
