package irvine.oeis.a217;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A217441 Numbers k such that 26*k+1 is a square.
 * @author Sean A. Irvine
 */
public class A217441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217441() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {0, 24, 28, 100, 108});
  }
}
