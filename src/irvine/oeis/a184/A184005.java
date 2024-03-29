package irvine.oeis.a184;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A184005 a(n) = n - 1 + ceiling(3*n^2/4); complement of A184004.
 * @author Sean A. Irvine
 */
public class A184005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184005() {
    super(1, new long[] {1, -2, 0, 2}, new long[] {1, 4, 9, 15});
  }
}
