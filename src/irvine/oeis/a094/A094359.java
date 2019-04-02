package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094359 Pair reversal of a Jacobsthal sequence.
 * @author Sean A. Irvine
 */
public class A094359 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094359() {
    super(new long[] {4, 4, -1}, new long[] {0, 1, 2});
  }
}
