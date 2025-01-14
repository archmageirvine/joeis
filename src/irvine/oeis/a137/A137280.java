package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137280 a(n) = 3*a(n-1) + 7*a(n-2), with a(1) = 1, a(2) = 10.
 * @author Sean A. Irvine
 */
public class A137280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137280() {
    super(1, new long[] {7, 3}, new long[] {1, 10});
  }
}
