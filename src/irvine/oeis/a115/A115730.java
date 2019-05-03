package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115730 <code>a(n) = a(n-3)+A001654(n-1)</code> with <code>a(0)=0, a(1)=0</code> and <code>a(2)=1</code>.
 * @author Sean A. Irvine
 */
public class A115730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115730() {
    super(new long[] {1, -2, -2, 0, 2, 2}, new long[] {0, 0, 1, 2, 6, 16});
  }
}
