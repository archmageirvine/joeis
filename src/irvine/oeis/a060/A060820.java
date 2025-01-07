package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060820 a(n) = (2*n-1)^2 + (2*n)^2.
 * @author Sean A. Irvine
 */
public class A060820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060820() {
    super(1, new long[] {1, -3, 3}, new long[] {5, 25, 61});
  }
}
