package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267036 Decimal representation of the n-th iteration of the "Rule 85" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267036() {
    super(new long[] {-4, 1, 4}, new long[] {1, 3, 16});
  }
}
