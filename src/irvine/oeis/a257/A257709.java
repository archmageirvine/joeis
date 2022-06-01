package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257709 Numbers n such that T(n) + T(n+1) + ... + T(n+26) is a square, where T = A000217 (triangular numbers).
 * @author Sean A. Irvine
 */
public class A257709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257709() {
    super(new long[] {1, -1, 0, 0, 0, 0, -10, 10, 0, 0, 0, 0, 1}, new long[] {8, 14, 39, 53, 103, 112, 206, 264, 509, 647, 1141, 1230, 2160});
  }
}
