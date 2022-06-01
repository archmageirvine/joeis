package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213396 Number of (w,x,y) with all terms in {0,...,n} and 2*w &lt; |x+y-w|.
 * @author Sean A. Irvine
 */
public class A213396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213396() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {0, 3, 9, 21, 42, 72});
  }
}
