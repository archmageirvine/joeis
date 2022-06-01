package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212741 Number of (w,x,y,z) with all terms in {0,...,n} and max{w,x,y,z}&gt;=2*min{w,x,y,z}.
 * @author Sean A. Irvine
 */
public class A212741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212741() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {1, 15, 79, 239, 593, 1199, 2239, 3759});
  }
}
