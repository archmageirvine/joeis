package irvine.oeis.a288;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A288176 a(n) = 2*a(n-1) + 2*a(n-2) - 4*a(n-3) + a(n-4), where a(0) = 2, a(1) = 4, a(2) = 8, a(3) = 16.
 * @author Sean A. Irvine
 */
public class A288176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288176() {
    super(new long[] {1, -4, 2, 2}, new long[] {2, 4, 8, 16});
  }
}
