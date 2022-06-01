package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212561 Number of (w,x,y,z) with all terms in {1,...,n} and w + x = 2y + 2z.
 * @author Sean A. Irvine
 */
public class A212561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212561() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 0, 1, 5, 12, 26});
  }
}
