package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154152 Indices k such that 26 plus the k-th triangular number is a perfect square.
 * @author Sean A. Irvine
 */
public class A154152 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154152() {
    super(1, new long[] {1, -1, -6, 6, 1}, new long[] {4, 10, 37, 67, 220});
  }
}
