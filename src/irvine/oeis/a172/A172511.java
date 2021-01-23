package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172511 a(n) = a(n-1) * (11*a(n-1) - a(n-2)) / (a(n-1) + 4*a(n-2)), with a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A172511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172511() {
    super(new long[] {1, -11, 33, -33, 11}, new long[] {1, 1, 2, 7, 35});
  }
}
