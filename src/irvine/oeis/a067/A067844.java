package irvine.oeis.a067;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A067844 Numbers k such that k and 2^k end with the same digit.
 * @author Sean A. Irvine
 */
public class A067844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067844() {
    super(1, new long[] {-1, 1, 1}, new long[] {14, 16, 34});
  }
}
