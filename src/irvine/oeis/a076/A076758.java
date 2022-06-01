package irvine.oeis.a076;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A076758 a(n) = n*(n+1)^2*(2+n)*(3+2*n)*(19+8*n)/180.
 * @author Sean A. Irvine
 */
public class A076758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076758() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 9, 98, 516, 1870, 5369, 13132});
  }
}
