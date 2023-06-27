package irvine.oeis.a268;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A268539 Numbers k such that 48*k+25 is a perfect square.
 * @author Sean A. Irvine
 */
public class A268539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268539() {
    super(1, new long[] {1, -3, 5, -7, 7, -5, 3}, new long[] {0, 2, 3, 7, 17, 25, 28});
  }
}
