package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266180 Decimal representation of the n-th iteration of the "Rule 6" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266180 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266180() {
    super(new long[] {16, 0}, new long[] {1, 6});
  }
}
