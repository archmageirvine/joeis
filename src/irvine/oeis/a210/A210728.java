package irvine.oeis.a210;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A210728 a(n) = a(n-1) + a(n-2) + n + 2 with n&gt;1, a(0)=1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A210728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210728() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 2, 7, 14});
  }
}
