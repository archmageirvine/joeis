package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114051 x such that x^2 - 23*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A114051 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114051() {
    super(new long[] {-1, 48}, new long[] {1, 24});
  }
}
