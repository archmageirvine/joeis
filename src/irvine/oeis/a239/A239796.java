package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239796 a(n) = 7*n^2 + 2*n - 15.
 * @author Sean A. Irvine
 */
public class A239796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239796() {
    super(new long[] {1, -3, 3}, new long[] {-6, 17, 54});
  }
}
