package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213390 Number of (w,x,y) with all terms in <code>{0,</code>...,n} and max(w,x,y) <code>&gt;=</code> 2*min(w,x,y).
 * @author Sean A. Irvine
 */
public class A213390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213390() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 7, 25, 55, 109, 181});
  }
}
