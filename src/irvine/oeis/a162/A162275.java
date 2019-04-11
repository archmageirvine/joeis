package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162275 <code>a(n) = 10*a(n-1) - 22*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 2, a(1) = 13</code>.
 * @author Sean A. Irvine
 */
public class A162275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162275() {
    super(new long[] {-22, 10}, new long[] {2, 13});
  }
}
