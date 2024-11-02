package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214864 Numbers k such that k XOR 10 = k - 10.
 * @author Sean A. Irvine
 */
public class A214864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214864() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {10, 11, 14, 15, 26});
  }
}
