package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281362 <code>a(0) = 1, a(1) = 2;</code> for <code>n&gt;1, a(n) = a(n-1) + a(n-2) + floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A281362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281362() {
    super(new long[] {1, 0, -3, 1, 2}, new long[] {1, 2, 4, 7, 13});
  }
}
