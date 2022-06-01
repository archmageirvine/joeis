package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135497 a(n) = n^5 - n^2.
 * @author Sean A. Irvine
 */
public class A135497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135497() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 0, 28, 234, 1008, 3100});
  }
}
