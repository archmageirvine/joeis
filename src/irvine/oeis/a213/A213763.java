package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213763 Principal diagonal of the convolution array A213762.
 * @author Sean A. Irvine
 */
public class A213763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213763() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 11, 43, 127});
  }
}
