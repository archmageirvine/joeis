package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212677 Number of (w,x,y,z) with all terms in {1,...,n} and w+y=|x-y|+|y-z|.
 * @author Sean A. Irvine
 */
public class A212677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212677() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {0, 0, 1, 7, 21, 46});
  }
}
