package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212570 Number of (w,x,y,z) with all terms in {1,...,n} and |w-x|=|x-y|+|y-z|.
 * @author Sean A. Irvine
 */
public class A212570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212570() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 1, 6, 23, 52, 105});
  }
}
