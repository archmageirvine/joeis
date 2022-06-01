package irvine.oeis.a063;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A063523 a(n) = n*(8*n^2 - 5)/3.
 * @author Sean A. Irvine
 */
public class A063523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063523() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 18, 67});
  }
}
