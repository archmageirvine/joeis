package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165809 a(n) = 3*n*(310*n^2 + 63*n - 12).
 * @author Sean A. Irvine
 */
public class A165809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165809() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1083, 8124, 26703, 62400});
  }
}
