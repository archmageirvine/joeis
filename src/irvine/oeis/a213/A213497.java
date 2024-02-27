package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213497 Number of (w,x,y) with all terms in {0,...,n} and w = min(|w-x|,|x-y|).
 * @author Sean A. Irvine
 */
public class A213497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213497() {
    super(new long[] {1, 0, -2, -1, 1, 2, 0}, new long[] {1, 4, 10, 17, 29, 40, 57});
  }
}
