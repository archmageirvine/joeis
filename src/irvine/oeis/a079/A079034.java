package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079034 Determinant of M(n), the n X n matrix defined by m(i,i) = 1, m(i,j) = i-j.
 * @author Sean A. Irvine
 */
public class A079034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079034() {
    super(0, new long[] {1, -5, 10, -10, 5}, new long[] {1, 1, 2, 7, 21});
  }
}
