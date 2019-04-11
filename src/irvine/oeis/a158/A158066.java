package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158066 <code>a(n) = 49*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A158066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158066() {
    super(new long[] {-1, 2}, new long[] {50, 99});
  }
}
