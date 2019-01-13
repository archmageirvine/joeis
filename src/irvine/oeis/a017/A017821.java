package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017821.
 * @author Sean A. Irvine
 */
public class A017821 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017821() {
    super(new long[] {1, 1, 1, 1, 1, 1, 0, 0}, new long[] {1, 0, 0, 1, 1, 1, 2, 3});
  }
}
