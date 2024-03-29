package irvine.oeis.a063;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A063492 a(n) = (2*n - 1)*(11*n^2 - 11*n + 6)/6.
 * @author Sean A. Irvine
 */
public class A063492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063492() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 14, 60, 161});
  }
}
