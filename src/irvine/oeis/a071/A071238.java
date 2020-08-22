package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071238 a(n) = n*(n+1)*(2*n^2+1)/6.
 * @author Sean A. Irvine
 */
public class A071238 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071238() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 9, 38, 110});
  }
}
