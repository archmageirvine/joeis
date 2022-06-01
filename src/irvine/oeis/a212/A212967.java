package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212967 Number of (w,x,y) with all terms in {0,...,n} and w &lt; range{w,x,y}.
 * @author Sean A. Irvine
 */
public class A212967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212967() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 3, 10, 26, 50, 89});
  }
}
