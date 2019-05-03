package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267058 Decimal representation of the n-th iteration of the "Rule <code>97"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267058() {
    super(new long[] {-256, 0, 256, 0, 1, 0}, new long[] {1, 0, 20, 19, 256, 255});
  }
}
