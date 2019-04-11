package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213045 Number of (w,x,y) with all terms in <code>{0,</code>...,n} and 2|w-x|&gt;max(w,x,y)-min(w,x,y).
 * @author Sean A. Irvine
 */
public class A213045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213045() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 4, 14, 36, 72});
  }
}
