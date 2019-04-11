package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067844 Numbers k such that k and <code>2^k</code> end with the same digit.
 * @author Sean A. Irvine
 */
public class A067844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067844() {
    super(new long[] {-1, 1, 1}, new long[] {14, 16, 34});
  }
}
