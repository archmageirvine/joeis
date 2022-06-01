package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022029 a(n) = 3*a(n-1) + a(n-2) - a(n-3) - a(n-5).
 * @author Sean A. Irvine
 */
public class A022029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022029() {
    super(new long[] {-1, 0, -1, 1, 3}, new long[] {4, 13, 42, 135, 433});
  }
}
