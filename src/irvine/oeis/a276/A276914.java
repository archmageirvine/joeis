package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276914 Subsequence of triangular numbers obtained by adding a square and two smaller triangles, a(n) = n^2 + 2*A000217(A052928(n)).
 * @author Sean A. Irvine
 */
public class A276914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276914() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 10, 15, 36});
  }
}
