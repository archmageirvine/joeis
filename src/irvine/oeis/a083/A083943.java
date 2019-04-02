package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083943 A generalized Jacobsthal sequence.
 * @author Sean A. Irvine
 */
public class A083943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083943() {
    super(new long[] {-2, 1, 2}, new long[] {0, 1, -1});
  }
}
