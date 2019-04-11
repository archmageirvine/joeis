package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213490 Number of (w,x,y) with all terms in <code>{0,...,n}</code> and the numbers w,x,y,|w-x|,|x-y| distinct.
 * @author Sean A. Irvine
 */
public class A213490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213490() {
    super(new long[] {-1, 1, 1, 0, 0, -2, 0, 0, 1, 1}, new long[] {0, 0, 0, 0, 0, 12, 38, 92, 160, 286});
  }
}
