package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060820 (2*n-1)^2 + (2*n)^2.
 * @author Sean A. Irvine
 */
public class A060820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060820() {
    super(new long[] {1, -3, 3}, new long[] {5, 25, 61});
  }
}
