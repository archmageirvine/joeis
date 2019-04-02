package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213482 Number of (w,x,y) with all terms in {0,...,n} and |w-x|+|x-y| &gt; w+x+y.
 * @author Sean A. Irvine
 */
public class A213482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213482() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 3, 14, 41, 87, 161});
  }
}
