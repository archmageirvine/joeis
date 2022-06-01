package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226492 a(n) = n*(11*n-5)/2.
 * @author Sean A. Irvine
 */
public class A226492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226492() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 17});
  }
}
