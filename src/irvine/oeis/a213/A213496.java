package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213496 Number of (w,x,y) with all terms in {0,...,n} and x != max(|w-x|,|x-y|).
 * @author Sean A. Irvine
 */
public class A213496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213496() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 4, 13, 41, 82, 158});
  }
}
