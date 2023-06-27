package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213577 Principal diagonal of the convolution array A213576.
 * @author Sean A. Irvine
 */
public class A213577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213577() {
    super(1, new long[] {-1, 1, 6, -3, -6, 5}, new long[] {1, 4, 17, 56, 172, 498});
  }
}
