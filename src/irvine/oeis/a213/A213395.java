package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213395 Number of (w,x,y) with all terms in {0,...,n} and max(|w-x|,|x-y|) = w.
 * @author Sean A. Irvine
 */
public class A213395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213395() {
    super(new long[] {1, 0, -2, -1, 1, 2, 0}, new long[] {1, 4, 11, 19, 31, 44, 62});
  }
}
