package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163304 a(n) = n^4 + 984*n^3 + 902*n^2 + 394*n + 858.
 * @author Sean A. Irvine
 */
public class A163304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163304() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {858, 3139, 13142, 36807, 80098});
  }
}
