package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266516 Decimal representation of the n-th iteration of the "Rule 29" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266516() {
    super(new long[] {64, 0, -84, 0, 21, 0}, new long[] {1, 3, 4, 111, 16, 1983});
  }
}
