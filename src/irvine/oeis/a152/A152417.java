package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152417 a(n) = (5^n - 1)/(2^(3 - (n mod 2))).
 * @author Sean A. Irvine
 */
public class A152417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152417() {
    super(new long[] {-25, 0, 26, 0}, new long[] {0, 1, 3, 31});
  }
}
