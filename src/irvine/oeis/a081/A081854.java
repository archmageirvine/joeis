package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081854 (8*n-3)*(4*n-1)*(8*n^2-5*n+1).
 * @author Sean A. Irvine
 */
public class A081854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081854() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {3, 60, 2093, 13398, 47415});
  }
}
