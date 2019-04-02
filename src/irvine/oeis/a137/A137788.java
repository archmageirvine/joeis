package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137788 a(n) = 6^n - 5^n - 4^n - 3^n - 2^n.
 * @author Sean A. Irvine
 */
public class A137788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137788() {
    super(new long[] {720, -1044, 580, -155, 20}, new long[] {-8, -18, -8, 318, 3352});
  }
}
