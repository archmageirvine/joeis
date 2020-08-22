package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212689 Number of (w,x,y,z) with all terms in {1,...,n} and 2|w-x|&gt;n+|y-z|.
 * @author Sean A. Irvine
 */
public class A212689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212689() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 0, 0, 6, 20, 58, 124});
  }
}
