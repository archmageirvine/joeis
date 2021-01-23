package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172118 n*(n+1)*(5*n^2-n-3)/2.
 * @author Sean A. Irvine
 */
public class A172118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172118() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 45, 234, 730});
  }
}
