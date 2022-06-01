package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101094 a(n) = n*(n+1)*(n+2)*(n+3)*(1+3*n+n^2)/120.
 * @author Sean A. Irvine
 */
public class A101094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101094() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 11, 57, 203, 574, 1386, 2982});
  }
}
