package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212068 Number of (w,x,y,z) with all terms in {1,...,n} and 2w=x+y+z.
 * @author Sean A. Irvine
 */
public class A212068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212068() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 0, 3, 10, 25});
  }
}
