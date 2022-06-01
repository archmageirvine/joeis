package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213484 Number of (w,x,y) with all terms in {0,...,n} and |w-x| + |x-y| + |y-w| &gt;= w+x+y.
 * @author Sean A. Irvine
 */
public class A213484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213484() {
    super(new long[] {1, -3, 4, -4, 3}, new long[] {1, 4, 7, 10, 16});
  }
}
