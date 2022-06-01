package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212681 Number of (w,x,y,z) with all terms in {1,...,n} and |x-y|&lt;|y-z|.
 * @author Sean A. Irvine
 */
public class A212681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212681() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 0, 4, 24, 88, 230, 504});
  }
}
