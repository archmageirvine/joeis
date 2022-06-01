package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173731 a(n) = a(n-1) * (11*a(n-1) - a(n-2)) / (a(n-1) + 4*a(n-2)), a(0) = a(1) = 0, a(2) = 1.
 * @author Sean A. Irvine
 */
public class A173731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173731() {
    super(new long[] {1, -11, 33, -33, 11}, new long[] {0, 0, 1, 11, 88});
  }
}
