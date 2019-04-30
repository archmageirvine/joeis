package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172511 <code>a(n) = a(n-1) * (11*a(n-1) - a(n-2)) / (a(n-1) + 4*a(n-2))</code>, with <code>a(0) = a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A172511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172511() {
    super(new long[] {1, -11, 33, -33, 11}, new long[] {1, 1, 2, 7, 35});
  }
}
