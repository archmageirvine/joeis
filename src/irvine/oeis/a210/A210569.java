package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210569 a(n) = (n-3)*(n-2)*(n-1)*n*(n+1)/30.
 * @author Sean A. Irvine
 */
public class A210569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210569() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 0, 0, 0, 4, 24});
  }
}
