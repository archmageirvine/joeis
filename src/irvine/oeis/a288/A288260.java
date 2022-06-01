package irvine.oeis.a288;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A288260 a(n) = 2*a(n-1) + 2*a(n-3) - 3*a(n-4), where a(0) = 2, a(1) = 4, a(2) = 8, a(3) = 16.
 * @author Sean A. Irvine
 */
public class A288260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288260() {
    super(new long[] {-3, 2, 0, 2}, new long[] {2, 4, 8, 16});
  }
}
