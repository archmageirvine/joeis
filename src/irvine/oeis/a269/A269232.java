package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269232 a(n) = (n + 1)*(6*n^2 + 15*n + 4)/2.
 * @author Sean A. Irvine
 */
public class A269232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269232() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 25, 87, 206});
  }
}
