package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163675 a(n) = n*(2*n^2 + 5*n + 19)/2.
 * @author Sean A. Irvine
 */
public class A163675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163675() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 13, 37, 78});
  }
}
