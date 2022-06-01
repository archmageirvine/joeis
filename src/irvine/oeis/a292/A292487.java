package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292487 p-INVERT of the odd positive integers, where p(S) = 1 - S - 4 S^2.
 * @author Sean A. Irvine
 */
public class A292487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292487() {
    super(new long[] {4, 11, -3, 5}, new long[] {1, 8, 44, 212});
  }
}
