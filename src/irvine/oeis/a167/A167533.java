package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167533 <code>a(n) = 71*n - a(n-1)</code> for <code>n&gt;0, a(0)=12</code>.
 * @author Sean A. Irvine
 */
public class A167533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167533() {
    super(new long[] {-1, 1, 1}, new long[] {12, 59, 83});
  }
}
