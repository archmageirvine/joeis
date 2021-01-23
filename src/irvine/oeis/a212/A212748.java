package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212748 Number of (w,x,y,z) with all terms in {0,...,n} and w=2*floor((x+y+z)/2)).
 * @author Sean A. Irvine
 */
public class A212748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212748() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 4, 17, 20, 53, 56, 117});
  }
}
