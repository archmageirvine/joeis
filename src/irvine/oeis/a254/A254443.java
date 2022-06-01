package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254443 Numbers n such that T(n) + T(n+1) + ... + T(n+21) is a square, where T(m) = A000217(m) is the m-th triangular number.
 * @author Sean A. Irvine
 */
public class A254443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254443() {
    super(new long[] {1, -1, -20, 20, 1}, new long[] {35, 75, 911, 1707, 18383});
  }
}
