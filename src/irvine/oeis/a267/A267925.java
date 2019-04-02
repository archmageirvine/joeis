package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267925 Binary representation of the n-th iteration of the "Rule 246" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267925() {
    super(new long[] {-10000, 10000, 1}, new long[] {1, 111, 10111});
  }
}
