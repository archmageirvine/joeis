package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116972 a(n) = 11*3^n - 2*n - 10.
 * @author Sean A. Irvine
 */
public class A116972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116972() {
    super(new long[] {3, -7, 5}, new long[] {1, 21, 85});
  }
}
