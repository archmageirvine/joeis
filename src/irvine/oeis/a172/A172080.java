package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172080 a(n) = n*(12*n^3 + 10*n^2 - 9*n - 7)/6.
 * @author Sean A. Irvine
 */
public class A172080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172080() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 37, 190, 590});
  }
}
