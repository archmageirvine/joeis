package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212747 Number of (w,x,y,z) with all terms in {0,...,n} and 2w=floor((x+y+z)/2).
 * @author Sean A. Irvine
 */
public class A212747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212747() {
    super(new long[] {-1, 4, -7, 8, -7, 4}, new long[] {1, 4, 13, 32, 63, 108});
  }
}
