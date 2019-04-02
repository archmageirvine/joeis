package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200782 Expansion of 1 / (1 - 6*x + 20*x^3 - 15*x^4 + x^6).
 * @author Sean A. Irvine
 */
public class A200782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200782() {
    super(new long[] {-1, 0, 15, -20, 0, 6}, new long[] {1, 6, 36, 196, 1071, 5796});
  }
}
