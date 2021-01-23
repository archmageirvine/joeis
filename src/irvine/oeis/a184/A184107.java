package irvine.oeis.a184;

import irvine.oeis.LinearRecurrence;

/**
 * A184107 n-1+ceiling((n/6)^2); complement of A184106.
 * @author Sean A. Irvine
 */
public class A184107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184107() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {1, 2, 3, 4, 5, 6, 8, 9, 11, 12, 14, 15, 17, 19, 21, 23, 25, 26, 29, 31});
  }
}
