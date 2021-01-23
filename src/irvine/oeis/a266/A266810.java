package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266810 Decimal representation of the n-th iteration of the "Rule 62" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266810() {
    super(new long[] {32, -8, 0, -4, -31, 8, 0, 4}, new long[] {1, 7, 25, 111, 433, 1751, 7033, 28047});
  }
}
