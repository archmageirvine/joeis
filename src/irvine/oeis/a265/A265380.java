package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265380 Binary representation of the middle column of the "Rule 158" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A265380 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A265380() {
    super(new long[] {-10, 1, 0, 0, 10}, new long[] {1, 11, 111, 1110, 11101});
  }
}
