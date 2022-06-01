package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077446 Numbers n such that 2*n^2 + 14 is a square.
 * @author Sean A. Irvine
 */
public class A077446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077446() {
    super(new long[] {-1, 0, 6, 0}, new long[] {1, 5, 11, 31});
  }
}
