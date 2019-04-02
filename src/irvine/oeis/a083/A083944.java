package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083944 A generalized Jacobsthal sequence.
 * @author Sean A. Irvine
 */
public class A083944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083944() {
    super(new long[] {-2, 1, 2}, new long[] {0, 1, -2});
  }
}
