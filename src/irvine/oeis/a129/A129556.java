package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129556 Numbers k such that the k-th centered pentagonal number A005891(k) = (5k^2 + 5k + 2)/2 is a square.
 * @author Sean A. Irvine
 */
public class A129556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129556() {
    super(1, new long[] {1, -1, -38, 38, 1}, new long[] {0, 2, 21, 95, 816});
  }
}
