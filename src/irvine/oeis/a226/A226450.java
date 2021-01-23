package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226450 a(n) = n*(3*n^2 - 5*n + 3).
 * @author Sean A. Irvine
 */
public class A226450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226450() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 10, 45});
  }
}
