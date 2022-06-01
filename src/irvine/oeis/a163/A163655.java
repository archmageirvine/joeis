package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163655 a(n) = n*(2*n^2 + 5*n + 13)/2.
 * @author Sean A. Irvine
 */
public class A163655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163655() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 10, 31, 69});
  }
}
