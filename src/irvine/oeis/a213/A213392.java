package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213392 Number of (w,x,y) with all terms in <code>{0,...,n}</code> and 2*max(w,x,y) <code>&gt;=</code> 3*min(w,x,y).
 * @author Sean A. Irvine
 */
public class A213392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213392() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {1, 7, 25, 61, 115, 199, 319, 469});
  }
}
