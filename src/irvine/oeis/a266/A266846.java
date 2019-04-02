package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266846 Decimal representation of the n-th iteration of the "Rule 70" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266846() {
    super(new long[] {-32, 16, 2}, new long[] {1, 6, 20});
  }
}
