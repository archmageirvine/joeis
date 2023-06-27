package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090990 Number of meaningful differential operations of the n-th order on the space R^5.
 * @author Sean A. Irvine
 */
public class A090990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090990() {
    super(1, new long[] {-1, 2, 1}, new long[] {5, 9, 16});
  }
}
