package irvine.oeis.a184;

import irvine.oeis.LinearRecurrence;

/**
 * A184105 <code>n-1+ceiling((n/5)^2)</code>; complement of <code>A184104</code>.
 * @author Sean A. Irvine
 */
public class A184105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184105() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {1, 2, 3, 4, 5, 7, 8, 10, 12, 13, 15, 17, 19, 21, 23, 26, 28, 30, 33, 35, 38, 41, 44, 47, 49, 53, 56});
  }
}
