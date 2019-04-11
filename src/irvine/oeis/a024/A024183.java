package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024183 Second elementary symmetric function of <code>3,4,...,n+3</code>.
 * @author Sean A. Irvine
 */
public class A024183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024183() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {12, 47, 119, 245, 445});
  }
}
