package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158560 a(n) = 30*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158560() {
    super(new long[] {1, -3, 3}, new long[] {29, 119, 269});
  }
}
