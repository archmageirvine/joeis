package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213398 Number of (w,x,y) with all terms in {0,...,n} and min(|w-x|,|x-y|) = x.
 * @author Sean A. Irvine
 */
public class A213398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213398() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 4, 10, 17});
  }
}
