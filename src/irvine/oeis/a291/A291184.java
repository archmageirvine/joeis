package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291184 p-INVERT of the positive integers, where p(S) = 1 - 4*S + 3*S^2.
 * @author Sean A. Irvine
 */
public class A291184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291184() {
    super(new long[] {-1, 8, -17, 8}, new long[] {4, 21, 104, 507});
  }
}
