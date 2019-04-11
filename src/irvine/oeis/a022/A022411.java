package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022411 <code>a(n) = a(n-1) + a(n-2) + 1,</code> with <code>a(0)=3, a(1)=12</code>.
 * @author Sean A. Irvine
 */
public class A022411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022411() {
    super(new long[] {-1, 0, 2}, new long[] {3, 12, 16});
  }
}
