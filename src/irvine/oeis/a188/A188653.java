package irvine.oeis.a188;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A188653 Second differences of A000463; first differences of A188652.
 * @author Sean A. Irvine
 */
public class A188653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188653() {
    super(new long[] {1, 2, 0, -2}, new long[] {1, 1, -3, 7});
  }
}
