package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129444 Numbers n such that centered triangular number A005448(n) <code>= 3n(n-1)/2 + 1</code> is a perfect square.
 * @author Sean A. Irvine
 */
public class A129444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129444() {
    super(new long[] {1, -1, -10, 10, 1}, new long[] {0, 1, 2, 7, 16});
  }
}
