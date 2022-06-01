package irvine.oeis.a184;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A184112 n+ceiling(n^2/16); complement of A184111.
 * @author Sean A. Irvine
 */
public class A184112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184112() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, -1, 2}, new long[] {2, 3, 4, 5, 7, 9, 11, 12, 15, 17});
  }
}
