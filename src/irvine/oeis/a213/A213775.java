package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213775 Principal diagonal of the convolution array A213774.
 * @author Sean A. Irvine
 */
public class A213775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213775() {
    super(new long[] {-1, 0, 4, -2, -4, 4}, new long[] {1, 11, 38, 97, 213, 432});
  }
}
