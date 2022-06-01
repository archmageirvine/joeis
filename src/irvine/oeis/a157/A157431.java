package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157431 a(n) = 4*n^2 + 73*n + 333.
 * @author Sean A. Irvine
 */
public class A157431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157431() {
    super(new long[] {1, -3, 3}, new long[] {410, 495, 588});
  }
}
