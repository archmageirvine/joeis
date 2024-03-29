package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139280 a(n) = 90*n - 81.
 * @author Sean A. Irvine
 */
public class A139280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139280() {
    super(1, new long[] {-1, 2}, new long[] {9, 99});
  }
}
