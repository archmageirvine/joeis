package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213839 Principal diagonal of the convolution array A213838.
 * @author Sean A. Irvine
 */
public class A213839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213839() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 20, 89, 240});
  }
}
