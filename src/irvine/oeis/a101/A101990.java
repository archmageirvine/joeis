package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101990 <code>a(1) = a(2) = 1, a(3) = 9</code>; for <code>n &gt; 3, a(n) = 3*a(n-1) - 3*a(n-2) + 9*a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A101990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101990() {
    super(new long[] {9, -3, 3}, new long[] {1, 1, 9});
  }
}
