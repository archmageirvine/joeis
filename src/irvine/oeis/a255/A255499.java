package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255499 a(n) = (n^4 + 2*n^3 - n^2)/2.
 * @author Sean A. Irvine
 */
public class A255499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255499() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 14, 63, 184});
  }
}
