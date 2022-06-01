package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172076 a(n) = n*(n+1)*(14*n-11)/6.
 * @author Sean A. Irvine
 */
public class A172076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172076() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 17, 62});
  }
}
