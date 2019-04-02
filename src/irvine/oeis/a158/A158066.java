package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158066 a(n) = 49*n + 1.
 * @author Sean A. Irvine
 */
public class A158066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158066() {
    super(new long[] {-1, 2}, new long[] {50, 99});
  }
}
