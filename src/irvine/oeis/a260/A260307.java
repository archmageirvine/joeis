package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260307 <code>a(n) = a(n-1) + a(n-2) - a(n-3) + a(n-6) - a(n-7) - a(n-8) + a(n-9)</code> with <code>a(0) - a(8)</code> as shown below.
 * @author Sean A. Irvine
 */
public class A260307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260307() {
    super(new long[] {-1, 0, 1, 0, 0, 0, 1, 0}, new long[] {1, 2, 3, 4, 6, 5, 8, 7});
  }
}
