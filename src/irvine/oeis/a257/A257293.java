package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257293 Numbers n such that T(n) + T(n+1) <code>+ ... +</code> T(n+12) is a square, where T = A000217 (triangular numbers).
 * @author Sean A. Irvine
 */
public class A257293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257293() {
    super(new long[] {1, -1, 0, 0, -102, 102, 0, 0, 1}, new long[] {3, 29, 75, 432, 998, 3624, 8310, 44717, 102443});
  }
}
