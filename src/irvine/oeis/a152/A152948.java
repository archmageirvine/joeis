package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152948 a(n) = (n^2 - 3*n + 6)/2.
 * @author Sean A. Irvine
 */
public class A152948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152948() {
    super(1, new long[] {1, -3, 3}, new long[] {2, 2, 3});
  }
}
