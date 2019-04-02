package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090989 Number of meaningful differential operations of the n-th order on the space R^4.
 * @author Sean A. Irvine
 */
public class A090989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090989() {
    super(new long[] {2, 0}, new long[] {4, 6});
  }
}
