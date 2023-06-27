package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090992 Number of meaningful differential operations of the n-th order on the space R^7.
 * @author Sean A. Irvine
 */
public class A090992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090992() {
    super(1, new long[] {-1, -2, 3, 1}, new long[] {7, 13, 24, 45});
  }
}
