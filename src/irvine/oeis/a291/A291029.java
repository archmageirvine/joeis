package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291029 p-INVERT of the positive integers, where p(S) = 1 - S - S^2 - S^3.
 * @author Sean A. Irvine
 */
public class A291029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291029() {
    super(new long[] {-1, 7, -18, 25, -18, 7}, new long[] {1, 4, 15, 55, 198, 706});
  }
}
