package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115730 a(n) = a(n-3) + A001654(n-1) with a(0)=0, a(1)=0 and a(2)=1.
 * @author Sean A. Irvine
 */
public class A115730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115730() {
    super(new long[] {1, -2, -2, 0, 2, 2}, new long[] {0, 0, 1, 2, 6, 16});
  }
}
