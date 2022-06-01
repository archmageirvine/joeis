package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095894 a(2n) = 6*n^2 + 7*n + 1; a(2n+1) = 6*n^2 + 13*n + 7.
 * @author Sean A. Irvine
 */
public class A095894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095894() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 7, 14, 26});
  }
}
