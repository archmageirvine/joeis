package irvine.oeis.a062;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A062510 a(n) = 2^n + (-1)^(n+1).
 * @author Sean A. Irvine
 */
public class A062510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062510() {
    super(new long[] {2, 1}, new long[] {0, 3});
  }
}
