package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267055 Decimal representation of the n-th iteration of the "Rule 93" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267055() {
    super(new long[] {64, 0, -84, 0, 21, 0}, new long[] {1, 3, 20, 47, 336, 703});
  }
}
