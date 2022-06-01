package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154575 a(n) = 2*n^2 + 12*n + 4.
 * @author Sean A. Irvine
 */
public class A154575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154575() {
    super(new long[] {1, -3, 3}, new long[] {18, 36, 58});
  }
}
