package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164539 <code>a(n) = 2*a(n-1) + 7*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 1, a(1) = 13</code>.
 * @author Sean A. Irvine
 */
public class A164539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164539() {
    super(new long[] {7, 2}, new long[] {1, 13});
  }
}
