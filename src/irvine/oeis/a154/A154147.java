package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154147 Indices k such that 19 plus the k-th triangular number is a perfect square.
 * @author Sean A. Irvine
 */
public class A154147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154147() {
    super(1, new long[] {1, -1, -6, 6, 1}, new long[] {3, 9, 30, 60, 179});
  }
}
