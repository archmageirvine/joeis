package irvine.oeis.a210;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A210695 a(n) = 6*a(n-1) - a(n-2) + 6 with n&gt;1, a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A210695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210695() {
    super(new long[] {1, -7, 7}, new long[] {0, 1, 12});
  }
}
