package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213502 Number of (w,x,y) with all terms in {0,...,n} and x != min(|w-x|,|x-y|).
 * @author Sean A. Irvine
 */
public class A213502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213502() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 4, 17, 47, 98});
  }
}
