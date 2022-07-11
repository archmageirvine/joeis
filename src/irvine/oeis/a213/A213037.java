package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213037 a(n) = n^2 - 2*floor(n/2)^2.
 * @author Sean A. Irvine
 */
public class A213037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213037() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 2, 7, 8});
  }
}
