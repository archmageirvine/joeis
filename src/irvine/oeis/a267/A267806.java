package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267806 <code>a(0) = a(1) = 1;</code> for <code>n&gt;1, a(n) = (a(n-1) mod 2) + a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A267806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267806() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {1, 1, 2, 1, 3});
  }
}
