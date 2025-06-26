package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158310 a(n) = 361*n + 1.
 * @author Sean A. Irvine
 */
public class A158310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158310() {
    super(1, new long[] {-1, 2}, new long[] {362, 723});
  }
}
