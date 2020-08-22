package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270868 a(n) = n^4 + 3*n^3 + 8*n^2 + 9*n + 2.
 * @author Sean A. Irvine
 */
public class A270868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270868() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {2, 23, 92, 263, 614});
  }
}
