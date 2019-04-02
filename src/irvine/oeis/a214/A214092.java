package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214092 Principal diagonal of the convolution array A213773.
 * @author Sean A. Irvine
 */
public class A214092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214092() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 23, 102, 274});
  }
}
