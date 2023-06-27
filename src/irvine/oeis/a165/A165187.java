package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165187 a(n) = n^3*(n+1)^2*(n+2)/12.
 * @author Sean A. Irvine
 */
public class A165187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165187() {
    super(1, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 24, 180, 800, 2625, 7056, 16464});
  }
}
