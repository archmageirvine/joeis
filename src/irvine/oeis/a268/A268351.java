package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268351 a(n) = 3*n*(9*n - 1)/2.
 * @author Sean A. Irvine
 */
public class A268351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268351() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 51});
  }
}
