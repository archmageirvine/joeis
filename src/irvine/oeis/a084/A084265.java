package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084265 a(n) = (n^2 + 3*n + 1 + (-1)^n) / 2.
 * @author Sean A. Irvine
 */
public class A084265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084265() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 2, 6, 9});
  }
}
