package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213779 Principal diagonal of the convolution array <code>A213778</code>.
 * @author Sean A. Irvine
 */
public class A213779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213779() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 6, 15, 33, 58, 97});
  }
}
