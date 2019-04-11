package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212988 Number of (w,x,y) with all terms in <code>{0,</code>...,n} and 4*w = x+y.
 * @author Sean A. Irvine
 */
public class A212988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212988() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {1, 1, 2, 4, 7, 9});
  }
}
