package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153111 Solutions of the Pell-like equation 1 + 6*A*A = 7*B*B, with A, B integers.
 * @author Sean A. Irvine
 */
public class A153111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153111() {
    super(new long[] {-1, 26}, new long[] {1, 25});
  }
}
