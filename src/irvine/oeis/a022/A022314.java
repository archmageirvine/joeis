package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022314 a(n) = a(n-1) + a(n-2) + 1, with a(0) = 0, a(1) = 9.
 * @author Sean A. Irvine
 */
public class A022314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022314() {
    super(new long[] {-1, 0, 2}, new long[] {0, 9, 10});
  }
}
