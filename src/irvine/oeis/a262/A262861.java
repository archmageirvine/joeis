package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262861 Binary representation of the n-th iteration of the "Rule 147" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A262861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262861() {
    super(new long[] {-10000, 0, 10001, 0}, new long[] {1, 101, 10001, 1011101});
  }
}
