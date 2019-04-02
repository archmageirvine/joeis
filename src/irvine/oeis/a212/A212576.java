package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212576 Number of (w,x,y,z) with all terms in {1,...,n} and |w-x|=2|x-y|+2|y-z|.
 * @author Sean A. Irvine
 */
public class A212576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212576() {
    super(new long[] {-1, 0, 1, 2, 1, -2, -2, -2, 1, 2, 1, 0}, new long[] {0, 1, 2, 7, 16, 33, 52, 87, 126, 181, 246, 331});
  }
}
