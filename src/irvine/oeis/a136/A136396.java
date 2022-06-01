package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136396 a(n) = 1 + n*(n+1)*(n^2-n+12)/12.
 * @author Sean A. Irvine
 */
public class A136396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136396() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 8, 19, 41});
  }
}
