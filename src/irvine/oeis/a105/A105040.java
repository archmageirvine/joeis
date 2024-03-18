package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105040 Nonnegative k such that 7*k^2 + 7*k + 1 is a square.
 * @author Sean A. Irvine
 */
public class A105040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105040() {
    super(1, new long[] {1, -1, -254, 254, 1}, new long[] {0, 15, 111, 3936, 28320});
  }
}
