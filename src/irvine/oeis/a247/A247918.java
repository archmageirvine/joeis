package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247918 Expansion of (1 + x) / ((1 - x^4) * (1 + x^4 - x^5)) in powers of x.
 * @author Sean A. Irvine
 */
public class A247918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247918() {
    super(new long[] {-1, 2, -2, 2, -1, 1, -1, 1}, new long[] {1, 1, 0, 0, 0, 1, 1, 0});
  }
}
