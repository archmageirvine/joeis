package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162148 a(n) = n*(n+1)*(5*n+7)/6.
 * @author Sean A. Irvine
 */
public class A162148 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162148() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 4, 17, 44});
  }
}
