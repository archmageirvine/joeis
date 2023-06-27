package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174618 For n odd a(n) = a(n-2) + a(n-3), for n even a(n) = a(n-2) + a(n-5); with a(1) = 0, a(2) = 1.
 * @author Sean A. Irvine
 */
public class A174618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174618() {
    super(1, new long[] {1, 0, 0, 0, -1, 0, 2, 0}, new long[] {0, 1, 0, 1, 1, 1, 2, 1});
  }
}
