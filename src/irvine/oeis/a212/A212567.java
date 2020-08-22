package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212567 Number of (w,x,y,z) with all terms in {1,...,n} and 2w+2x=3y+3z.
 * @author Sean A. Irvine
 */
public class A212567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212567() {
    super(new long[] {-1, 0, 2, 2, -1, -4, -1, 2, 2, 0}, new long[] {0, 0, 2, 5, 11, 27, 42, 68, 106, 149});
  }
}
