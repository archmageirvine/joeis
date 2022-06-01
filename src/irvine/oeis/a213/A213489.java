package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213489 Number of (w,x,y) with all terms in {0,...,n} and |w-x| + |x-y| + |y-w| &gt;= w + x + y.
 * @author Sean A. Irvine
 */
public class A213489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213489() {
    super(new long[] {-1, 4, -7, 8, -7, 4}, new long[] {1, 7, 19, 37, 64, 103});
  }
}
