package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213845 Principal diagonal of the convolution array A213844.
 * @author Sean A. Irvine
 */
public class A213845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213845() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 32, 119, 296});
  }
}
