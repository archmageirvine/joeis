package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213389 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>max(w,x,y) &lt; 2*min(w,x,y)</code>.
 * @author Sean A. Irvine
 */
public class A213389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213389() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 1, 2, 9, 16, 35});
  }
}
