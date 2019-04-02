package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210731 a(n) = a(n-1)+a(n-2)+n+3 with n&gt;1, a(0) = a(1) = 0.
 * @author Sean A. Irvine
 */
public class A210731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210731() {
    super(new long[] {1, -1, -2, 3}, new long[] {0, 0, 5, 11});
  }
}
