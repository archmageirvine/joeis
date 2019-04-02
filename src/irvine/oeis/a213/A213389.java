package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213389 Number of (w,x,y) with all terms in {0,...,n} and max(w,x,y) &lt; 2*min(w,x,y).
 * @author Sean A. Irvine
 */
public class A213389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213389() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 1, 2, 9, 16, 35});
  }
}
