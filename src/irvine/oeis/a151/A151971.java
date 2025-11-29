package irvine.oeis.a151;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A151971 Numbers k such that k^2 - k is divisible by 21.
 * @author Sean A. Irvine
 */
public class A151971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151971() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 7, 15, 21});
  }
}
