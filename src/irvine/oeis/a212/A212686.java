package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212686 Number of (w,x,y,z) with all terms in {1,...,n} and 2|w-x|=n+|y-z|.
 * @author Sean A. Irvine
 */
public class A212686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212686() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 0, 4, 8, 24, 40});
  }
}
