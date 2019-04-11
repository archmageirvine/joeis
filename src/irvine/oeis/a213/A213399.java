package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213399 Number of (w,x,y) with all terms in <code>{0,</code>...,n} and max(|w-x|,|x-y|) <code>= x</code>.
 * @author Sean A. Irvine
 */
public class A213399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213399() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 4, 14, 23, 43});
  }
}
