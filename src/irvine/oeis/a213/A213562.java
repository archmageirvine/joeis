package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213562 Principal diagonal of the convolution array A213561.
 * @author Sean A. Irvine
 */
public class A213562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213562() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 18, 109, 407, 1152, 2723});
  }
}
