package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022316 a(n) = a(n-1) + a(n-2) + 1, with a(0) = 0 and a(1) = 11.
 * @author Sean A. Irvine
 */
public class A022316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022316() {
    super(new long[] {-1, 0, 2}, new long[] {0, 11, 12});
  }
}
