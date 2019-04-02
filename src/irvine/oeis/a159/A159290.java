package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159290 A generalized Jacobsthal sequence.
 * @author Sean A. Irvine
 */
public class A159290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159290() {
    super(new long[] {-2, 1, 2}, new long[] {3, 5, 13});
  }
}
