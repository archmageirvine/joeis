package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267209 Binary representation of the middle column of the "Rule <code>109"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267209() {
    super(new long[] {-10, 1, 0, 10}, new long[] {1, 11, 111, 1110});
  }
}
