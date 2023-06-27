package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158803 Numbers k such that k^2 == 2 (mod 41).
 * @author Sean A. Irvine
 */
public class A158803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158803() {
    super(1, new long[] {-1, 1, 1}, new long[] {17, 24, 58});
  }
}
