package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090991 Number of meaningful differential operations of the n-th order on the space R^6.
 * @author Sean A. Irvine
 */
public class A090991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090991() {
    super(new long[] {1, 1}, new long[] {6, 10});
  }
}
