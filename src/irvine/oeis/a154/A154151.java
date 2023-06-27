package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154151 Indices k such that 25 plus the k-th triangular number is a perfect square.
 * @author Sean A. Irvine
 */
public class A154151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154151() {
    super(1, new long[] {1, -1, -6, 6, 1}, new long[] {0, 18, 21, 111, 128});
  }
}
