package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267855 Decimal representation of the n-th iteration of the "Rule <code>230"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267855() {
    super(new long[] {-256, 0, 16, 0, 16, 0}, new long[] {1, 6, 20, 120, 368, 1888});
  }
}
