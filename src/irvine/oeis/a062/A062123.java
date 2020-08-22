package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062123 a(n) = 2 + 9*n*(1 + n)/2.
 * @author Sean A. Irvine
 */
public class A062123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062123() {
    super(new long[] {1, -3, 3}, new long[] {2, 11, 29});
  }
}
