package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054569 a(n) = 4*n^2 - 6*n + 3.
 * @author Sean A. Irvine
 */
public class A054569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054569() {
    super(new long[] {1, -3, 3}, new long[] {1, 7, 21});
  }
}
