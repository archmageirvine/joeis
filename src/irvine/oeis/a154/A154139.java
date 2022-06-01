package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154139 Indices k such that 4 plus the k-th triangular number is a perfect square.
 * @author Sean A. Irvine
 */
public class A154139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154139() {
    super(new long[] {1, -1, -6, 6, 1}, new long[] {0, 6, 9, 39, 56});
  }
}
