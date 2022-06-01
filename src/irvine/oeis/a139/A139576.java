package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139576 a(n) = n(2n+9).
 * @author Sean A. Irvine
 */
public class A139576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139576() {
    super(new long[] {1, -3, 3}, new long[] {0, 11, 26});
  }
}
