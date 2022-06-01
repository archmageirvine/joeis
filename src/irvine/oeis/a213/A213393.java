package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213393 Number of (w,x,y) with all terms in {0,...,n} and 2*max(w,x,y) &gt; 3*min(w,x,y).
 * @author Sean A. Irvine
 */
public class A213393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213393() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {0, 6, 24, 54, 108, 192, 300, 450});
  }
}
