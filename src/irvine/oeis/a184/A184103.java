package irvine.oeis.a184;

import irvine.oeis.LinearRecurrence;

/**
 * A184103 <code>n-1+ceiling(n^2/4)</code>; complement of <code>A184102</code>.
 * @author Sean A. Irvine
 */
public class A184103 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184103() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, -1, 2}, new long[] {1, 2, 3, 4, 6, 8, 10, 11, 14, 16});
  }
}
