package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022410 <code>a(n) = a(n-1) + a(n-2) + 1</code> for <code>n&gt;1, a(0)=3, a(1)=11</code>.
 * @author Sean A. Irvine
 */
public class A022410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022410() {
    super(new long[] {-1, 0, 2}, new long[] {3, 11, 15});
  }
}
