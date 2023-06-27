package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257708 Numbers n such that T(n) + T(n+1) + ... + T(n+24) is a square, where T = A000217 (triangular numbers).
 * @author Sean A. Irvine
 */
public class A257708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257708() {
    super(1, new long[] {1, -1, -6, 6, 1}, new long[] {25, 55, 208, 382, 1273});
  }
}
