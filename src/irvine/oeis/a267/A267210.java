package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267210 Decimal representation of the middle column of the "Rule <code>109"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267210 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267210() {
    super(new long[] {-2, 1, 0, 2}, new long[] {1, 3, 7, 14});
  }
}
