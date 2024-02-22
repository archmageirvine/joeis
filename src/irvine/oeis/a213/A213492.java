package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213492 Number of (w,x,y) with all terms in {0,...,n} and w != min(|w-x|, |x-y|, |y-w|).
 * @author Sean A. Irvine
 */
public class A213492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213492() {
    super(new long[] {-1, 2, 0, -1, -1, 0, 2}, new long[] {0, 4, 18, 48, 98, 178, 290});
  }
}
