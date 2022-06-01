package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053410 a(1) = 0, a(2) = 16, a(2n+1) = 10*a(2n) - a(2n-1), a(2n) = 10*a(2n-1) - a(2n-2) + 16.
 * @author Sean A. Irvine
 */
public class A053410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053410() {
    super(new long[] {1, -10, 0, 10}, new long[] {0, 16, 160, 1600});
  }
}
