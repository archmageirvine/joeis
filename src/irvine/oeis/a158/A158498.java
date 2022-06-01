package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158498 a(n) = (1/2)*(n^3 - 6*n^2 + 13*n - 6).
 * @author Sean A. Irvine
 */
public class A158498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158498() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 2, 3, 7});
  }
}
