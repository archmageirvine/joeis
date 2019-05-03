package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213546 Principal diagonal of the convolution array <code>A213505</code>.
 * @author Sean A. Irvine
 */
public class A213546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213546() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 25, 170, 674, 1979, 4795});
  }
}
