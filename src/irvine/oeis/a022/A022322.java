package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022322 a(n) = a(n-1) + a(n-2) + 1, with a(0) = 1 and a(1) = 8.
 * @author Sean A. Irvine
 */
public class A022322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022322() {
    super(new long[] {-1, 0, 2}, new long[] {1, 8, 10});
  }
}
