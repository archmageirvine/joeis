package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090993 Number of meaningful differential operations of the n-th order on the space <code>R^8</code>.
 * @author Sean A. Irvine
 */
public class A090993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090993() {
    super(new long[] {3, 0}, new long[] {8, 14});
  }
}
