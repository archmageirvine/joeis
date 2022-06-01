package irvine.oeis.a064;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A064429 a(n) = floor(n / 3) * 3 + sign(n mod 3) * (3 - n mod 3).
 * @author Sean A. Irvine
 */
public class A064429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064429() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 2, 1, 3});
  }
}
