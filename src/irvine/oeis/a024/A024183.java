package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024183 Second elementary symmetric function of 3,4,...,n+3.
 * @author Sean A. Irvine
 */
public class A024183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024183() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {12, 47, 119, 245, 445});
  }
}
